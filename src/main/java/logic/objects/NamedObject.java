package logic.objects;

public abstract class NamedObject {
    private static String name;
    private static String description;

    NamedObject(String newName, String newDescription) {
        name = newName;
        description = newDescription;
    }

    public static String getName() {
        return name;
    }

    public static String getDescription() {
        return description;
    }
}
