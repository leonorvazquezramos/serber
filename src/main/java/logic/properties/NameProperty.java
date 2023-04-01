package logic.properties;

public class NameProperty extends Property {
    NameProperty() {
        super("name");
    }

    @Override
    public void setValue(String value) {
        this.value = new PropertyValue(value);
    }
}
