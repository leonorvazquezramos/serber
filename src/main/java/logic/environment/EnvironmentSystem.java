package logic.environment;

import logic.objects.BaseObject;

import static logic.system.SystemClasses.ROOT;

public class EnvironmentSystem extends BaseObject {

    public EnvironmentSystem() {
        super(ROOT, "Main System, environment of every other SubSystem");
    }

}
