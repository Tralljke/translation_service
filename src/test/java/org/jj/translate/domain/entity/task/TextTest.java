package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;
import org.jj.translate.util.StringGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void of_ValueIsNull_ThrowEx() {
        var ex = assertThrows(CodedException.class, () -> Text.of(null));
        assertEquals(TaskError.TEXT_VALUE_REQUIRED, ex.getCode());
    }

    @Test
    void of_ValueIsLarge_ThrowEx() {
        var valueIsLarge = StringGenerator.getRandomString(600);

        var ex = assertThrows(CodedException.class, () -> Text.of(valueIsLarge));
        assertEquals(TaskError.TEXT_LARGE_VALUE, ex.getCode());
    }

    @Test
    void of_ValueIsValid_ReturnText() {
        var valueIsValid = StringGenerator.getRandomString(400);

        Text text = Text.of(valueIsValid);

        assertNotNull(text);
        assertEquals(valueIsValid, text.getValue());
    }

}