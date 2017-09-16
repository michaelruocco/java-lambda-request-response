package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_UNPROCESSABLE_ENTITY;
import static org.assertj.core.api.Assertions.assertThat;

public class UnprocessableEntityLambdaResponseTest {

    private UnprocessableEntityLambdaResponse response = new UnprocessableEntityLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToUnprocessableEntity() {
        assertThat(response.getStatusCode()).isEqualTo(SC_UNPROCESSABLE_ENTITY);
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

        LambdaResponse createdResponse = new UnprocessableEntityLambdaResponse(message);

        assertThat(createdResponse.getBody()).isEqualTo("{\"message\":\"some error message\"}");
    }

    @Test
    public void statusCodeShouldDefaultToUnproessableEntityWhenCreatedWithErrorMessage() {
        String message = "some error message";

        LambdaResponse createdResponse = new UnprocessableEntityLambdaResponse(message);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_UNPROCESSABLE_ENTITY);
    }

}
