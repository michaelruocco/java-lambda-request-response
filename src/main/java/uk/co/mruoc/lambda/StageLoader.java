package uk.co.mruoc.lambda;

import org.apache.commons.lang3.StringUtils;

public class StageLoader {

    private static final String DEFAULT_STAGE = "dev";

    public static String load() {
        String stage = System.getProperty("stage");
        if (StringUtils.isEmpty(stage))
            return DEFAULT_STAGE;
        return stage;
    }

}
