package system;

import properties.Property;

import java.util.List;

public class BaseSystemObject {

    protected String description;

    protected final SystemType type;
    List<BaseSystemObject> components;
    List<Property> ownProperties;


    BaseSystemObject(SystemType type, String description) {
        this.type = type;
        this.description = description;
    }

    protected SystemType getType() {
        return type;
    }
}
