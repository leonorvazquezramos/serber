package logic.objects;


import common.annotations.DocumentedClass;
import logic.system.Natures;

@DocumentedClass(
        description = "object that has a name"

)
public abstract class NamedObject extends SemanticObject {
    protected String name;

    public NamedObject(String name, String description, Natures nature) {
        super(description, nature);
        this.name = name;
    }
}
