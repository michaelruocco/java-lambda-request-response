package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.assertj.core.api.Assertions.assertThat;

public class NotFoundLambdaResponseTest {

    private NotFoundLambdaResponse response = new NotFoundLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToNotFound() {
        assertThat(response.getStatusCode()).isEqualTo(SC_NOT_FOUND);
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

    @Test
    public void statusCodeShouldDefaultToNotFoundWhenCreatedWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new NotFoundLambdaResponse(body);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_NOT_FOUND);
    }

}
