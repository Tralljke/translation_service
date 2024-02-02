package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;

public final class TaskError {

    public static final String TASK_IDENTIFIER_VALUE_REQUIRED = "fec34e82-001";
    public static final String TASK_IDENTIFIER_ILLEGAL_VALUE = "fec34e82-002";
    public static final String LANG_VALUE_REQUIRED = "fec34e82-003";
    public static final String LANG_ILLEGAL_VALUE = "fec34e82-004";
    public static final String TEXT_VALUE_REQUIRED = "fec34e82-005";
    public static final String TEXT_LARGE_VALUE = "fec34e82-006";
    public static final String ID_TEXT_TASK_REQUIRED = "fec34e82-007";
    public static final String SOURCE_LANG_TEXT_TASK_REQUIRED = "fec34e82-008";
    public static final String SOURCE_TEXT_REQUIRED = "fec34e82-009";
    public static final String TARGET_LANG_REQUIRED = "fec34e82-010";
    public static final String STATUS_TEXT_TASK_REQUIRED = "fec34e82-011";
    public static final String CREATED_AT_TEXT_TASK_REQUIRED = "fec34e82-012";


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

    public static CodedException errLangIllegalValue(String value) {
        var msg = String.format("Value for a lang is illegal value: [%s]", value);
        return new CodedException(LANG_ILLEGAL_VALUE, msg);
    }

    public static CodedException errTextValueIsRequired() {
        var msg = "Value for a Text is required";
        return new CodedException(TEXT_VALUE_REQUIRED, msg);
    }

    public static CodedException errTextValueIsLarge() {
        var msg = "Value for a Text is large";
        return new CodedException(TEXT_LARGE_VALUE, msg);
    }

    public static CodedException errIdTextTaskIsRequired() {
        var msg = "ID for a TextTask is required";
        return new CodedException(ID_TEXT_TASK_REQUIRED, msg);
    }

    public static CodedException errSourceLangIsRequired() {
        var msg = "SourceLang for a TextTask is required";
        return new CodedException(SOURCE_LANG_TEXT_TASK_REQUIRED, msg);
    }

    public static CodedException errSourceTextIsRequired() {
        var msg = "SourceText for a TextTask is required";
        return new CodedException(SOURCE_TEXT_REQUIRED, msg);
    }

    public static CodedException errTargetLangIsRequired() {
        var msg = "TargetLang for a TextTask is required";
        return new CodedException(TARGET_LANG_REQUIRED, msg);
    }

    public static CodedException errStatusTextTaskIsRequired() {
        var msg = "Status for a TextTask is required";
        return new CodedException(STATUS_TEXT_TASK_REQUIRED, msg);
    }

    public static CodedException errCreatedAtTextTaskIsRequired() {
        var msg = "CreatedAt for a TextTask is required";
        return new CodedException(CREATED_AT_TEXT_TASK_REQUIRED, msg);
    }

    private TaskError() {}
}
