package logic.properties.magnitudes.directions;

import logic.objects.NamedObject;

public abstract class BaseDirection extends NamedObject {
    protected BaseDirection(String directionName) {
        super(directionName, "the position towards which someone or something moves or faces");
    }
}
