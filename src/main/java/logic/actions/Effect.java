package logic.actions;

import logic.environment.UniverseImage;
import logic.objects.NamedObject;

public class Effect extends NamedObject {
    UniverseImage consequences;
    protected Effect(String newName, String newDescription) {
        super(newName, newDescription);
    }
}
