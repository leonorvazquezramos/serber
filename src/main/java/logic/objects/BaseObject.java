package logic.objects;

import logic.properties.Property;
import logic.system.SystemClasses;

import java.util.List;

public class BaseObject extends NamedObject {


    List<BaseObject> components;
    List<Property> ownProperties;

    protected BaseObject(String objectName, String description) {
        super(objectName, description);
    }

}
