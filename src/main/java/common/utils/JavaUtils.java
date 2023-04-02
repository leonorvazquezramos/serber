package common.utils;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JavaUtils {
    public static void instantiateAllClassesByName(String className, String packageName) {

        Reflections reflections = new Reflections(packageName);
        Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);

        List<Class<?>> classList = allClasses.stream().toList();

        for(int i = 0; i < classList.size(); i++) {
            Constructor<?> constructor;
            try {
                constructor = classList.get(i).getConstructor((Class<?>) null);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            try {
                constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
