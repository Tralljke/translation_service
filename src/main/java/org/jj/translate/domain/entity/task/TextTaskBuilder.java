package org.jj.translate.domain.entity.task;

import java.time.Instant;

public class TextTaskBuilder {
    private TaskID id;
    private Lang sourceLang;
    private Text sourceText;
    private Lang targetLang;
    private Text translatedText;
    private Status status;
    private Instant createdAt;
    private Instant updatedAt;

    public TextTaskBuilder setId(TaskID id) {
        this.id = id;
        return this;
    }

    public TextTaskBuilder setSourceLang(Lang sourceLang) {
        this.sourceLang = sourceLang;
        return this;
    }

    public TextTaskBuilder setSourceText(Text sourceText) {
        this.sourceText = sourceText;
        return this;
    }

    public TextTaskBuilder setTargetLang(Lang targetLang) {
        this.targetLang = targetLang;
        return this;
    }

    public TextTaskBuilder setTranslatedText(Text translatedText) {
        this.translatedText = translatedText;
        return this;
    }

    public TextTaskBuilder setStatus(Status status) {
        this.status = status;
        return this;
    }

    public TextTaskBuilder setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public TextTaskBuilder setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public TextTask build() {
        checkRequiredFields();

        return new TextTask(
                this.id,
                this.sourceLang,
                this.sourceText,
                this.targetLang,
                this.translatedText,
                this.status,
                this.createdAt,
                this.updatedAt
        );
    }

    private void checkRequiredFields() {
        if (this.id == null) {
            throw TaskError.errIdTextTaskIsRequired();
        }
        if (this.sourceLang == null) {
            throw TaskError.errSourceLangIsRequired();
        }
        if (this.sourceText == null) {
            throw TaskError.errSourceTextIsRequired();
        }
        if (this.targetLang == null) {
            throw TaskError.errTargetLangIsRequired();
        }
        if (this.status == null) {
            throw TaskError.errStatusTextTaskIsRequired();
        }
        if (this.createdAt == null) {
            throw TaskError.errCreatedAtTextTaskIsRequired();
        }
    }
}
