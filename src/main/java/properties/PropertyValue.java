package properties;

public class PropertyValue {
    private final PropertyValueType type;
    private String value;

    PropertyValue(PropertyValueType type) {
        this.type = type;
    }

    PropertyValue(PropertyValueType type, String value) {
        this(type);
        this.value = setValue(type, value);
    }

    private String setValue(PropertyValueType type, String value) {
        switch (type) {

        }
    }
}
