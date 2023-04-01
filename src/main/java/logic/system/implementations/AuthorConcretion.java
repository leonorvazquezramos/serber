package logic.system.implementations;

import logic.objects.BaseObject;
import logic.system.Natures;

public class AuthorConcretion extends BaseObject {

    private Natures natures;
    AuthorConcretion(String name, String description, Natures nature) {
        super("author", "who creates something");

    }
}
