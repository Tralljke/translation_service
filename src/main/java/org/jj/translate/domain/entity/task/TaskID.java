package org.jj.translate.domain.entity.task;

import java.util.UUID;

public class TaskID {

    private final UUID value;

    public static TaskID create() {
        var uuid = UUID.randomUUID();
        return new TaskID(uuid);
    }

    public static TaskID of(String value) {
        if (value == null || value.isBlank()) {
            throw TaskError.errTaskIdentifierValueRequired();
        }

        try {
            var uuid = UUID.fromString(value);
            return new TaskID(uuid);
        } catch (IllegalArgumentException ex) {
            throw TaskError.errTaskIdentifierIllegalValue(ex, value);
        }
    }

    private TaskID(UUID value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}