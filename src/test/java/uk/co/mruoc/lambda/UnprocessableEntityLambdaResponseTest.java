package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnprocessableEntityLambdaResponseTest {

    private UnprocessableEntityLambdaResponse response = new UnprocessableEntityLambdaResponse();

    @Test
    public void statusCodeShouldDefaultTo422() {
        assertThat(response.getStatusCode()).isEqualTo(422);
    }

    @Test
    public void bodyShouldDefaultToEmpty() {
        assertThat(response.getBody()).isEmpty();
    }

    @Test
    public void headersShouldDefaultToEmpty() {
        assertThat(response.getHeaders().isEmpty()).isTrue();
    }

    @Test
    public void shouldSetBodyToJsonFormattedErrorMessage() {
        String message = "some error message";

        response.setErrorMessage(message);

        assertThat(response.getBody()).isEqualTo("{\"message\":\"some error message\"}");
    }

}
