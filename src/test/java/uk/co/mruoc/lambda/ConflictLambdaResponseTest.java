package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_CONFLICT;
import static org.assertj.core.api.Assertions.assertThat;

public class ConflictLambdaResponseTest {

    private ConflictLambdaResponse response = new ConflictLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToConflict() {
        assertThat(response.getStatusCode()).isEqualTo(SC_CONFLICT);
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

        LambdaResponse createdResponse = new ConflictLambdaResponse(message);

        assertThat(createdResponse.getBody()).isEqualTo("{\"message\":\"some error message\"}");
    }

    @Test
    public void statusCodeShouldDefaultToConflictWhenCreatedWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new ConflictLambdaResponse(body);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_CONFLICT);
    }

}
