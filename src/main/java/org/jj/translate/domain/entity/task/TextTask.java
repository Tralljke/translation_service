package org.jj.translate.domain.entity.task;

import java.time.Instant;

public class TextTask {
    private TaskID id; //null
    private Lang sourceLang;

    private Text sourceText;

    private Lang targetLang;
    private Text translatedText;
    //Status: CREATED, TRANSLATED, FAILED
    private Instant createdAt;
    private Instant updatedAt;
}
