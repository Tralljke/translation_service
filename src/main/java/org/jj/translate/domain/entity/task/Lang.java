package org.jj.translate.domain.entity.task;

public class Lang {

    private final String value;
    //Проверка, что value - это две маленькие латинские буквы
    //Либо найти библиотеку для этого

    public static Lang of(String value) {
        if (value == null || value.isBlank()) {
            throw TaskError.errLangValueRequired();
        }

        return new Lang(value);
    }

    private Lang(String str) {
        this.value = str;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
