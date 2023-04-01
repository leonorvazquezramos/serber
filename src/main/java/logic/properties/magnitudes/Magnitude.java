package logic.properties.magnitudes;

import logic.objects.NamedObject;

public abstract class Magnitude extends NamedObject {
    private final MeasuringUnit unit;

    protected Magnitude(String name, MeasuringUnit unit) {
        super(name, "what can be measured");
        this.unit = unit;
    }
}
