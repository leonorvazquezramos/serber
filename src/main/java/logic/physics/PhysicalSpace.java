package logic.physics;

import logic.system.Natures;
import logic.system.SystemImplementation;

import java.util.List;

import static logic.system.Natures.CONCRETE;

public class PhysicalSpace extends SystemImplementation {

    List<PhysicalPosition> occupiedPositions;

    protected PhysicalSpace() {
        super("physical space",
                "spatial construct where objects with physical body interact",
                CONCRETE);
    }
}
