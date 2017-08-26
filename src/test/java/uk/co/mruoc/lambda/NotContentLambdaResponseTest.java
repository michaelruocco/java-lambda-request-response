package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NotContentLambdaResponseTest {

    private final LambdaResponse response = new NotContentLambdaResponse();

    @Test
    public void statusCodeShouldDefaultTo204() {
        assertThat(response.getStatusCode()).isEqualTo(204);
    }

    @Test
    public void bodyShouldDefaultToEmpty() {
        assertThat(response.getBody()).isEmpty();
    }

    @Test
    public void headersShouldDefaultToEmpty() {
        assertThat(response.getHeaders().isEmpty()).isTrue();
    }

}
