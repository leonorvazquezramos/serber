package logic.physics;

import logic.system.SystemImplementation;

import static logic.system.Natures.CONCRETE;

public class PhysicalPosition extends SystemImplementation {
    protected PhysicalPosition() {
        super("physical position",
                "position in space",
                CONCRETE);
    }
}
