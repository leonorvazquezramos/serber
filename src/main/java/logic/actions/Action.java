package logic.actions;


import common.annotations.DocumentedClass;
import common.annotations.DocumentedMethod;
import logic.objects.NamedObject;

@DocumentedClass(
        description = "endeavour taken with a purpose"
)
public abstract class Action extends NamedObject {
    protected Actor actor;
    protected Effect intendedEffect;
    protected ActionExecution execution = new ActionExecution();

    protected Action(String newName, String newDescription, Actor actor, Effect intendedEffect) {
        super(newName, newDescription);
        this.actor = actor;
        this.intendedEffect = intendedEffect;
    }

    @DocumentedMethod(
            description = "changes the actor designed as owner",
            returns = Void.class
    )
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @DocumentedMethod(
            description = "starts the action performance",
            returns = Void.class
    )
    public void start() {
        execution.start();
    }
}
