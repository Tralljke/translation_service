package org.jj.translate.testdouble.stub;

import org.jj.translate.domain.entity.task.Lang;
import org.jj.translate.util.NumberGenerator;

import java.util.Locale;

public final class LangStub {

    public static Lang getLang() {
        var languages = Locale.getISOLanguages();
        var str = languages[NumberGenerator.getRandomNumber(0, languages.length - 1)];

        return Lang.of(str);
    }
}
