package logic.objects;

import common.annotations.DocumentedClass;
import logic.objects.frameworks.Framework;
import logic.system.Natures;


@DocumentedClass(description = "not concrete object")
public abstract class AbstractObject extends SystemObject {

    public AbstractObject(String name, String description, Natures nature, Framework framework) {
        super(name, description, nature, framework);
    }
}
