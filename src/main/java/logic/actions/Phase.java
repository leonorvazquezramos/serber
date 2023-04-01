package logic.actions;

import logic.objects.NamedObject;

public abstract class Phase extends NamedObject {
    protected Phase(String newName, String newDescription) {
        super(newName, newDescription);
    }
}
