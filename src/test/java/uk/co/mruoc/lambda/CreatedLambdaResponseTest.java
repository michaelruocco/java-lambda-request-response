package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatedLambdaResponseTest {

    private final LambdaResponse response = new CreatedLambdaResponse();

    @Test
    public void statusCodeShouldDefaultTo201() {
        assertThat(response.getStatusCode()).isEqualTo(201);
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
