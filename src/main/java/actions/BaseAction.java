package actions;

import annotations.Named;

@Named(getName = "")
public abstract class BaseAction {
    protected static BaseActor actor; //performs the action
    protected static BaseTarget target; //the action is performed upon it
}
