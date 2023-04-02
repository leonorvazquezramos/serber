package logic.actions;

import logic.objects.NamedObject;
import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.objects.frameworks.ProcessFramework;
import logic.system.Natures;
import logic.system.SystemImplementation;

public abstract class Phase extends SystemObject {

    public Phase(String name, String description, Framework framework, SystemImplementation universe) {
        super(name, description,
                Natures.ABSTRACT,
                framework);
        this.context = universe;
    }
}
