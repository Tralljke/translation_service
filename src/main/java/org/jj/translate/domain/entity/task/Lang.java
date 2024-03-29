package org.jj.translate.domain.entity.task;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Lang {

    private final String value;

    private final static List<String> languages = Arrays.asList(Locale.getISOLanguages());
    
    public static Lang of(String value) {
        if (value == null || value.isBlank()) {
            throw TaskError.errLangValueRequired();
        }
        
        if (!languages.contains(value)) {
            throw TaskError.errLangIllegalValue(value);
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
