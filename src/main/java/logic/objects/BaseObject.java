package logic.objects;

import logic.properties.ValuedObject;
import logic.system.SystemImplementation;

import java.util.List;

public abstract class BaseObject extends NamedObject {

    List<BaseObject> components;
    List<ValuedObject> ownProperties;
    SystemImplementation objectType;

    protected BaseObject(String objectName, String description) {
        super(objectName, description);
    }

}
