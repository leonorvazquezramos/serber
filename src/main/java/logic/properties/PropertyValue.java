package logic.properties;

import java.nio.charset.StandardCharsets;

public class PropertyValue {
    private byte[] value;

    PropertyValue(String value) {
        this.value = value.getBytes(StandardCharsets.UTF_8);
    }

    public void setValue(String value) {
        this.value = value.getBytes(StandardCharsets.UTF_8);
    }
}
