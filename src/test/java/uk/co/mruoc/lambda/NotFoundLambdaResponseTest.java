package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NotFoundLambdaResponseTest {

    private NotFoundLambdaResponse response = new NotFoundLambdaResponse();

    @Test
    public void statusCodeShouldDefaultTo404() {
        assertThat(response.getStatusCode()).isEqualTo(404);
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

    @Test
    public void shouldCreateWithErrorMessage() {
        String message = "some error message";

        LambdaResponse createdResponse = new NotFoundLambdaResponse(message);

        assertThat(createdResponse.getBody()).isEqualTo("{\"message\":\"some error message\"}");
    }

}
