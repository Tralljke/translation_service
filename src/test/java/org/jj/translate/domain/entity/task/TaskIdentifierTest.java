package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;
import org.jj.translate.util.StringGenerator;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TaskIdentifierTest {

    @Test
    void create_TaskIdentifier() {
        var id = TaskID.create();
        assertNotNull(id);
    }

    @Test
    void of_ValueIsNull_ThrowEx() {
        var ex = assertThrows(CodedException.class, () -> TaskID.of(null));

        assertEquals(TaskError.TASK_IDENTIFIER_VALUE_REQUIRED, ex.getCode());
        assertFalse(ex.getMessage().isBlank());
    }

    @Test
    void of_ValueIsBlank_ThrowEx() {
        var ex = assertThrows(CodedException.class, () -> TaskID.of(""));

        assertEquals(TaskError.TASK_IDENTIFIER_VALUE_REQUIRED, ex.getCode());
        assertFalse(ex.getMessage().isBlank());
    }

    @Test
    void of_ValueIsIllegal_ThrowEx() {
        var illegalValue = StringGenerator.getRandomString();
        var ex = assertThrows(CodedException.class, () -> TaskID.of(illegalValue));

        assertEquals(TaskError.TASK_IDENTIFIER_ILLEGAL_VALUE, ex.getCode());
        assertFalse(ex.getMessage().isBlank());
    }

    @Test
    void of_ValueIsValid_ReturnTaskID() {
        var validValue = UUID.randomUUID().toString();

        var taskID = TaskID.of(validValue);
        assertEquals(validValue, taskID.toString());
    }
}
