package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;

public final class TaskError {

    public static final String TASK_IDENTIFIER_VALUE_REQUIRED = "fec34e82-001";
    public static final String TASK_IDENTIFIER_ILLEGAL_VALUE = "fec34e82-002";
    public static final String LANG_VALUE_REQUIRED = "fec34e82-003";
    public static final String LANG_ILLEGAL_VALUE = "fec34e82-004";

    public static CodedException errTaskIdentifierValueRequired() {
        var msg = "Value for a task identifier is required";
        return new CodedException(TASK_IDENTIFIER_VALUE_REQUIRED, msg);
    }
    public static CodedException errTaskIdentifierIllegalValue(Throwable cause, String value) {
        var msg = String.format("Value [%s] for a task identifier is illegal", value);
        return new CodedException(TASK_IDENTIFIER_ILLEGAL_VALUE, msg, cause);
    }

    public static CodedException errLangValueRequired() {
        var msg = "Value for a lang is required";
        return new CodedException(LANG_VALUE_REQUIRED, msg);
    }

    private TaskError() {
    }

}
