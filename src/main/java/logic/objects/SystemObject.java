package logic.objects;

import common.annotations.DocumentedClass;
import common.annotations.DocumentedField;
import logic.objects.frameworks.Framework;
import logic.system.Natures;

@DocumentedClass(
        description = "first class citizen in the root System"
)
public class SystemObject extends NamedObject {
    @DocumentedField(
            description = "every object in the system belongs to at least one framework"
    )
    protected final Framework framework;

    public SystemObject(String name, String description, Natures nature, Framework framework) {
        super(name, description, nature);
        this.framework = framework;
    }
}
