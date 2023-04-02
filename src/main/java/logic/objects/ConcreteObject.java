package logic.objects;

import logic.objects.frameworks.Framework;
import logic.physics.PhysicalBody;
import logic.system.Natures;


public abstract class ConcreteObject extends NamedObject {
    private PhysicalBody body;

    public ConcreteObject(String name, String description, Natures nature, Framework framework) {
        super(name, description, nature, framework);
    }
}
