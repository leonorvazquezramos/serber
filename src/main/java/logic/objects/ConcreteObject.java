package logic.objects;

import logic.physics.PhysicalBody;
import logic.system.SystemImplementation;

import static logic.system.Natures.CONCRETE;

public abstract class ConcreteObject extends SystemImplementation {

    private PhysicalBody body;

    ConcreteObject () {
        super("concrete object",
                "can be perceived",
                CONCRETE);
    }
}
