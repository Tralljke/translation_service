package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;

class TaskIdentifierTest {

    @Test
    void create_TaskIdentifier() {
        var id = TaskIdentifier.create();
        assertNotNull(id);
    }

    @Test
    void of_ValueIsNull_ThrowEx() {
        var ex = assertThrows(CodedException.class, () -> TaskIdentifier.of(null));       

        assertEquals(TaskError.TASK_IDENTIFIER_VALUE_REQUIRED, ex.getCode());
        assertNotEmpty(ex.getMessage());
    }
}
