package logic.properties.magnitudes;

import logic.objects.NamedObject;
import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.system.Natures;
import logic.system.SystemImplementation;

public class MeasuringUnit extends SystemObject {

    public MeasuringUnit(String name, String description, Natures nature, Framework framework, SystemImplementation universe) {
        super(name, description, nature, framework, universe);
    }
}
