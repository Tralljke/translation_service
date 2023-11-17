package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;
import org.jj.translate.util.StringGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LangTest {

    @Test
    void of_ValueIsNull_TrowEx() {
        var ex = assertThrows(CodedException.class, () -> Lang.of(null));
        assertEquals(TaskError.LANG_VALUE_REQUIRED, ex.getCode());
    }

    @Test
    void of_ValueIsBlank_TrowEx() {
        var ex = assertThrows(CodedException.class, () -> Lang.of(""));
        assertEquals(TaskError.LANG_VALUE_REQUIRED, ex.getCode());
    }

    @Test
    void of_ValueIsIllegal_TrowEx() {
        var illegalValue = StringGenerator.getRandomString();
        var ex = assertThrows(CodedException.class, () -> Lang.of(illegalValue));
        assertEquals(TaskError.LANG_ILLEGAL_VALUE, ex.getCode());
    }

    @Test
    void of_ReturnLang() {
        var str = StringGenerator.getRandomString();
        var lang = Lang.of(str);
        assertEquals(str, lang.toString());
    }
}