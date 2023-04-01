package system;

import static system.SystemType.ROOT;

public class BaseSystem extends BaseSystemObject {

    public BaseSystem() {
        super(ROOT, "Main System, environment of every other SubSystem");
    }

}
