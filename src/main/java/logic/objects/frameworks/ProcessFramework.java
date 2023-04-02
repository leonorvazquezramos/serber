package logic.objects.frameworks;


import logic.system.Natures;

import static logic.system.Natures.ABSTRACT;

public class ProcessFramework extends Framework {
    protected ProcessFramework(String name, String description, Natures nature) {
        super("process",
                "progressing sth over time towards a goal",
                ABSTRACT);
    }
}
