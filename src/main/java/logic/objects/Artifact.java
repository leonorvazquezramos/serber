package logic.objects;

import logic.system.Natures;
import logic.system.implementations.AuthorConcretion;

public class Artifact extends BaseObject {

    private final AuthorConcretion author;

    protected Artifact(String name, String description, AuthorConcretion author) {
        super("artifact", "an Object that has a creator which is another Object and existed being as a result of a process");
        this.author = author;
    }
}
