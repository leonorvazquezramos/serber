package logic.system;

import logic.objects.BaseObject;

public abstract class SystemImplementation extends BaseObject {

    private final SystemAuthors author;
    private final SystemClasses clase;
    private final Natures nature;

    SystemImplementation(String name, String description, SystemAuthors author,
    SystemClasses clase, Natures nature) {
        super(name, description);
        this.author = author;
        this.clase = clase;
        this.nature = nature;
    }
}
