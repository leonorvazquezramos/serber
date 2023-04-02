package logic.objects;

import common.annotations.DocumentedClass;
import logic.system.Instant;
import logic.system.Natures;
import logic.system.SystemImplementation;


@DocumentedClass(
        description = "object that has a meaning, thus exists"
)
public abstract class SemanticObject {

    protected String description;
    protected Instant instantiationTime;
    protected Natures nature;
    protected SystemImplementation context;

    SemanticObject(String description, Natures nature, SystemImplementation universe) {
        this.description = description;
        this.nature = nature;
        this.instantiationTime = context.now();
        this.context = universe;
    }
}
