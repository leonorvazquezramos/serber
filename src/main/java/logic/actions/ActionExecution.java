package logic.actions;

import java.util.Arrays;
import java.util.List;

public class ActionExecution {
    private boolean started = false;
    private Action[] steps;

    ActionExecution(Action... steps) {
        this.steps = steps;
    }

    public void start() {
        started = true;
    }

    public void addStep(Action step) {
        List<Action> list = new java.util.ArrayList<>(Arrays.stream(steps).toList());
        list.add(step);
        steps = list.toArray(new Action[0]);
    }

    public boolean hasStarted() {
        return started;
    }
}
