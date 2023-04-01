package logic.properties;

import logic.objects.NamedObject;

public abstract class ValuedObject extends NamedObject {
    protected PropertyValue value;

    ValuedObject(PropertyValue value) {
        super("property", "ponderable quality");
    }

}
