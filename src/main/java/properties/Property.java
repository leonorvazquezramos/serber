package properties;

public abstract class Property {
    protected String name;
    protected String value;

    Property(String name) {
        this.name = name;
        this.value = null;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public abstract void setValue(String value);
}
