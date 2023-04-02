package logic.environment;

import logic.environment.evolution.EvolutionTree;
import logic.objects.SystemObject;
import logic.physics.PhysicalSpace;


public class Universe extends SystemObject {

    private PhysicalSpace space;
    private EvolutionTree objectTree = new EvolutionTree();

    public Universe() {
        super("universe",
                "Main System, environment of every other SubSystem");
    }

    public void createObject(java.lang.Object object) {
        objectTree.add(object);
    }

}
