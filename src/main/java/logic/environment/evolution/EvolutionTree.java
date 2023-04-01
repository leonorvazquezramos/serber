package logic.environment.evolution;

import java.util.LinkedList;

public class EvolutionTree {

    private final LinkedList<Object> fullTree = new LinkedList<>();

    public void add(Object object) {
        fullTree.add(object);
    }
}
