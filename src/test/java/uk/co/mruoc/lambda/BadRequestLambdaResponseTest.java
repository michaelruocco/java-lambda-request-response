package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.assertj.core.api.Assertions.assertThat;

public class BadRequestLambdaResponseTest {

    private ErrorLambdaResponse response = new BadRequestLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToBadRequest() {
        assertThat(response.getStatusCode()).isEqualTo(SC_BAD_REQUEST);
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

        LambdaResponse createdResponse = new BadRequestLambdaResponse(message);

        assertThat(createdResponse.getBody()).isEqualTo("{\"message\":\"some error message\"}");
    }

    @Test
    public void statusCodeShouldDefaultToBadRequestWhenCreatedWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new BadRequestLambdaResponse(body);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_BAD_REQUEST);
    }

}
