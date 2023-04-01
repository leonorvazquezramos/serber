package logic.actions;


import java.util.List;

public abstract class LifeCycle {
    private final Class<Object> owningType;
    private final List<Phase> phases;

    LifeCycle(Class<Object> owner, List<Phase> phases) {
        this.owningType = owner;
        this.phases = phases;
    }
}
