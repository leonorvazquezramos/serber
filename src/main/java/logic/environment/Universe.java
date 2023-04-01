package logic.environment;

import logic.environment.evolution.EvolutionTree;
import logic.objects.BaseObject;
import logic.physics.PhysicalSpace;


public class Universe extends BaseObject {

    private PhysicalSpace space;
    private EvolutionTree objectTree = new EvolutionTree();

    public Universe() {
        super("universe",
                "Main System, environment of every other SubSystem");
    }

    public void createObject(Object object) {
        objectTree.add(object);
    }

}
