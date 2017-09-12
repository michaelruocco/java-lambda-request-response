package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BadRequestLambdaResponseTest {

    private ErrorLambdaResponse response = new BadRequestLambdaResponse();

    @Test
    public void statusCodeShouldDefaultTo400() {
        assertThat(response.getStatusCode()).isEqualTo(400);
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
