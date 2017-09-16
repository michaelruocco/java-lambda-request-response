package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.assertj.core.api.Assertions.assertThat;

public class CreatedLambdaResponseTest {

    private final LambdaResponse response = new CreatedLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToCreated() {
        assertThat(response.getStatusCode()).isEqualTo(SC_CREATED);
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
    public void shouldCreateWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new CreatedLambdaResponse(body);

        assertThat(createdResponse.getBody()).isEqualTo(body);
    }

    @Test
    public void statusCodeShouldDefaultToCreatedWhenCreatedWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new CreatedLambdaResponse(body);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_CREATED);
    }

}
