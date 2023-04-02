package logic.actions;

import common.annotations.DocumentedClass;
import logic.objects.SystemObject;
import logic.objects.frameworks.Framework;
import logic.system.Natures;

import java.util.List;

@DocumentedClass(
        description = "endeavour taken with a purpose"
)
public abstract class Action extends SystemObject {
    List<SystemObject> trigger;
    List<SystemObject> receiver;

    protected Effect intendedEffect;
    protected ActionExecution execution = new ActionExecution();

    public Action(String name, String description,
                  Natures nature, Framework framework,
                  List<SystemObject> trigger,
                  List<SystemObject> receiver) {
        super(name, description, nature, framework);
        this.trigger = trigger;
        this.receiver = receiver;
    }

}
