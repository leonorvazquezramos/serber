package logic.objects.frameworks;

import common.annotations.DocumentedClass;
import logic.objects.NamedObject;
import logic.system.Natures;

import java.util.ArrayList;
import java.util.List;

import static logic.system.Natures.ABSTRACT;


@DocumentedClass(
        description = "basic structure underlying a system or concept"
)
public abstract class Framework extends NamedObject {
    private static final List<NamedObject> concepts = new ArrayList<>();

    protected Framework(String name, String description) {
        super(name, description, ABSTRACT);
    }

    protected static void registerConcept(NamedObject concept) {
        concepts.add(concept);
    }
}
