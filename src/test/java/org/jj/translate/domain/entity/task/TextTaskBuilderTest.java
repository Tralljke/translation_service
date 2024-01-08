package org.jj.translate.domain.entity.task;

import org.jj.translate.shared.exception.CodedException;
import org.jj.translate.testdouble.stub.LangStub;
import org.jj.translate.util.StringGenerator;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class TextTaskBuilderTest {

    @Test
    void build_IdIsNull_ThrowEx() {
        var sourceLang = LangStub.getLang();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var targetLang = LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(null).
                setSourceLang(sourceLang).
                setSourceText(sourceText).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.ID_TEXT_TASK_REQUIRED, ex.getCode());
    }

    @Test
    void build_SourceLangIsNull_ThrowEx() {
        var id = TaskID.create();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var targetLang = LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(id).
                setSourceLang(null).
                setSourceText(sourceText).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.SOURCE_LANG_TEXT_TASK_REQUIRED, ex.getCode());
    }

    @Test
    void build_SourceTextIsNull_ThrowEx() {
        var id = TaskID.create();
        var sourceLang = LangStub.getLang();
        var targetLang = LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(id).
                setSourceLang(sourceLang).
                setSourceText(null).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.SOURCE_TEXT_REQUIRED, ex.getCode());
    }

    @Test
    void build_targetLangIsNull_ThrowEx() {
        var id = TaskID.create();
        var sourceLang = LangStub.getLang();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(id).
                setSourceLang(sourceLang).
                setSourceText(sourceText).
                setTargetLang(null).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.TARGET_LANG_REQUIRED, ex.getCode());
    }

    @Test
    void build_statusIsNull_ThrowEx() {
        var id = TaskID.create();
        var sourceLang = LangStub.getLang();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var targetLang =LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(id).
                setSourceLang(sourceLang).
                setSourceText(sourceText).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(null).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.STATUS_TEXT_TASK_REQUIRED, ex.getCode());
    }

    @Test
    void build_createdAtIsNull_ThrowEx() {
        var id = TaskID.create();
        var sourceLang = LangStub.getLang();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var targetLang = LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var updatedAt = Instant.now();

        TextTaskBuilder textTaskBuilder = new TextTaskBuilder().
                setId(id).
                setSourceLang(sourceLang).
                setSourceText(sourceText).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(null).
                setUpdatedAt(updatedAt);

        var ex = assertThrows(CodedException.class, textTaskBuilder::build);
        assertEquals(TaskError.CREATED_AT_TEXT_TASK_REQUIRED, ex.getCode());
    }

    @Test
    void build_AllParamsIsValid_ReturnTextTask() {
        var id = TaskID.create();
        var sourceLang = LangStub.getLang();
        var sourceText = Text.of(StringGenerator.getRandomString(500));
        var targetLang = LangStub.getLang();
        var translatedText = Text.of(StringGenerator.getRandomString(500));
        var status = Status.CREATED;
        var createdAt = Instant.now();
        var updatedAt = Instant.now();

        var textTask = new TextTaskBuilder().
                setId(id).
                setSourceLang(sourceLang).
                setSourceText(sourceText).
                setTargetLang(targetLang).
                setTranslatedText(translatedText).
                setStatus(status).
                setCreatedAt(createdAt).
                setUpdatedAt(updatedAt).
                build();

        assertNotNull(textTask);
        assertEquals(id, textTask.getId());
        assertEquals(sourceLang, textTask.getSourceLang());
        assertEquals(sourceText, textTask.getSourceText());
        assertEquals(targetLang, textTask.getTargetLang());
        assertEquals(translatedText, textTask.getTranslatedText());
        assertEquals(status, textTask.getStatus());
        assertEquals(createdAt, textTask.getCreatedAt());
        assertEquals(updatedAt, textTask.getUpdatedAt());
    }
}