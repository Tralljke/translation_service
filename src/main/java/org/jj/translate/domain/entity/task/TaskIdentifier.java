package org.jj.translate.domain.entity.task;

import java.util.UUID;

public class TaskIdentifier {

    private final UUID value;

    public static TaskIdentifier create() {
        var uuid = UUID.randomUUID();
        return new TaskIdentifier(uuid);
    }

    public static TaskIdentifier of(String value) {
        if (value == null) {
            throw TaskError.errTaskIdentifierValueRequired();
        }

        if (value.isBlank()) {
            throw TaskError.errTaskIdentifierValueRequired();
        }

        try {
            var uuid = UUID.fromString(value);
            return new TaskIdentifier(uuid);
        } catch (IllegalArgumentException ex) {
            throw TaskError.errTaskIdentifierIllegalValue(ex, value);
        }
    }

    private TaskIdentifier(UUID value) {
        this.value = value;
    }

}