package uk.co.mruoc.lambda;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.RestoreSystemProperties;

import static org.assertj.core.api.Assertions.assertThat;

public class StageLoaderTest {

    @Rule
    public final RestoreSystemProperties properties = new RestoreSystemProperties();

    @Test
    public void shouldReturnConfiguredStage() {
        String stage = "sit";

        System.setProperty("stage", stage);

        assertThat(StageLoader.load()).isEqualTo(stage);
    }

    @Test
    public void shouldReturnDefaultStageIfStageNotConfigured() {
        System.setProperty("stage", "");

        assertThat(StageLoader.load()).isEqualTo("dev");
    }

}
