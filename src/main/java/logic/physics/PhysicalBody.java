package logic.physics;

import logic.system.SystemImplementation;

import static logic.system.Natures.CONCRETE;

public class PhysicalBody extends SystemImplementation {

    protected PhysicalPosition position = new PhysicalPosition();
    protected PhysicalBody() {
        super("physical body",
                "material shaped form occupying space",
                CONCRETE);
    }
}
