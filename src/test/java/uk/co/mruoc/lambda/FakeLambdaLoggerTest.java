package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FakeLambdaLoggerTest {

    private final FakeLambdaLogger logger = new FakeLambdaLogger();

    @Test
    public void shouldReturnLastLoggedMessage() {
        String message = "log-message";

        logger.log(message);

        assertThat(logger.getLastLoggedMessage()).isEqualTo(message);
    }

}
