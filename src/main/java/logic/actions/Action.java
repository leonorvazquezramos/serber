package logic.actions;


import logic.objects.NamedObject;

public abstract class Action extends NamedObject {
    protected Actor actor;
    protected Effect intendedEffect;
    protected ActionExecution execution = new ActionExecution();

    protected Action(String newName, String newDescription, Actor actor, Effect intendedEffect) {
        super(newName, newDescription);
        this.actor = actor;
        this.intendedEffect = intendedEffect;
    }

    protected void setActor(Actor actor) {
        this.actor = actor;
    }

    public void start() {
        execution.start();
    }
}
