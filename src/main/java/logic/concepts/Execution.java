package logic.concepts;

import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.system.Natures;

public class Execution extends SystemObject {

    public Execution(String name, String description, Natures nature, Framework framework) {
        super("execution",
                "each time an executable is executed",
                Natures.ABSTRACT,
                framework);
    }
}
