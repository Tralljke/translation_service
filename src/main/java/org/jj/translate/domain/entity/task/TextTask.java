package org.jj.translate.domain.entity.task;

import java.time.Instant;

public class TextTask {
    private TaskID id;
    private Lang sourceLang;
    private Text sourceText;
    private Lang targetLang;
    private Text translatedText;
    private Status status;
    private Instant createdAt;
    private Instant updatedAt;

    TextTask(TaskID id,
                    Lang sourceLang,
                    Text sourceText,
                    Lang targetLang,
                    Text translatedText,
                    Status status,
                    Instant createdAt,
                    Instant updatedAt) {
        this.id = id;
        this.sourceLang = sourceLang;
        this.sourceText = sourceText;
        this.targetLang = targetLang;
        this.translatedText = translatedText;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public TaskID getId() {
        return id;
    }

    public Lang getSourceLang() {
        return sourceLang;
    }

    public Text getSourceText() {
        return sourceText;
    }

    public Lang getTargetLang() {
        return targetLang;
    }

    public Text getTranslatedText() {
        return translatedText;
    }

    public Status getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
