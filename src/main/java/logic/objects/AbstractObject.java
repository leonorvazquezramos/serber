package logic.objects;

import common.annotations.DocumentedClass;
import logic.system.SystemImplementation;

import static logic.system.Natures.ABSTRACT;

@DocumentedClass(description = "not concrete object")
public abstract class AbstractObject extends SystemImplementation {

    AbstractObject() {
        super("abstract object", "can't be perceived",
                ABSTRACT);
    }

}
