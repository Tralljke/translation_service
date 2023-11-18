package org.jj.translate.domain.entity.task;

public class Text {

    private String value;

    public static Text of(String value) {
        if (value == null) {
            throw TaskError.errTextValueIsRequired();
        }

        if (value.length() > 500) {
            throw TaskError.errTextValueIsLarge();
        }

        return new Text(value);
    }

    private Text(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
