package logic.objects.frameworks;

import common.annotations.DocumentedClass;
import logic.objects.NamedObject;
import logic.system.Natures;

import java.util.ArrayList;
import java.util.List;


@DocumentedClass(
        description = "basic structure underlying a system or concept"
)
public abstract class Framework extends NamedObject {
    private final List<NamedObject> concepts = new ArrayList<>();

    protected Framework(String name, String description, Natures nature) {
        super(name, description, nature);
    }

    protected void registerConcept(NamedObject concept) {
        concepts.add(concept);
    }
}
