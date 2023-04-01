package system;

import java.util.List;

public class SystemObject {

    protected final SystemType type;
    List<Object> components;


    SystemObject(SystemType type) {
        this.type = type;
    }

    protected SystemType getType() {
        return type;
    }
}
