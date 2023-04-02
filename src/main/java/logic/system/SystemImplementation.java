package logic.system;

import logic.objects.NamedObject;
import logic.objects.frameworks.Framework;

import java.util.List;

import static common.utils.JavaUtils.instantiateAllClassesByName;

public abstract class SystemImplementation extends NamedObject {
    protected static final Instant now = new Instant();
    private List<Framework> existingFrameworks;

    protected SystemImplementation(String systemName, String systemDescription,
                                Natures systemNature) {
        super(systemName, systemDescription, systemNature);
    }

    protected void play() {
        instantiateFrameworks();
        while (true) {
            now.next();
        }
    }

    public Instant now() {
        return now;
    }

    private void instantiateFrameworks() {
        instantiateAllClassesByName("Framework", "logic.objects.frameworks");
    }

}
