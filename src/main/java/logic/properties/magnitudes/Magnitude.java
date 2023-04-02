package logic.properties.magnitudes;

import logic.objects.NamedObject;
import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.system.Natures;
import logic.system.SystemImplementation;

public abstract class Magnitude extends SystemObject {
    private MeasuringUnit unit;

    public Magnitude(String magnitudeName, String magnitudeDescription,
                     Natures magnitudeNature, Framework framework, SystemImplementation universe) {
        super(name, description, nature, framework, universe);
    }
}
