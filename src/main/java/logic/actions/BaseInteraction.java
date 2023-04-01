package logic.actions;

public abstract class BaseInteraction {
    protected boolean mutual;
    protected static BaseActor initiator; //initiates the action, if not mutual
    protected static BaseActor target; //receives the action, if not mutual
}
