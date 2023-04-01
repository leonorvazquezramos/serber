package logic.system;

import logic.objects.BaseObject;
import logic.system.implementations.AuthorConcretion;

public abstract class SystemImplementation extends BaseObject {

    private AuthorConcretion author;
    private final Natures nature;
    private final Instant now = new Instant();

    protected SystemImplementation(String name, String description, Natures nature) {
        super(name, description);
        this.nature = nature;
    }


}
