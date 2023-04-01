package logic.objects;


public abstract class NamedObject extends SemanticObject {

    private static String name;

    private NamedObject() {
        super("object with name");
    }

    protected NamedObject(String newName, String newDescription) {
        this();
        name = newName;
        description = newDescription;
    }

    protected void changeName(String newName) {
        name = newName;
    }

    protected String getName() {
        return name;
    }

}
