package logic.properties;

import logic.objects.NamedObject;
import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.system.Natures;
import logic.system.SystemImplementation;

public abstract class Property extends NamedObject {
    protected PropertyValue value;

    public Property(String propertyName, String propertyDescription,
                    Natures propertyNature) {
        super(propertyName, propertyDescription, propertyNature);
    }
}
