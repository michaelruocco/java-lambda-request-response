package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.Assertions.assertThat;

public class OkLambdaResponseTest {

    private final LambdaResponse response = new OkLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToOk() {
        assertThat(response.getStatusCode()).isEqualTo(SC_OK);
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

        LambdaResponse createdResponse = new OkLambdaResponse(body);

        assertThat(createdResponse.getBody()).isEqualTo(body);
    }

    @Test
    public void statusCodeShouldDefaultToOkWhenCreatedWithBody() {
        String body = "some-body";

        LambdaResponse createdResponse = new OkLambdaResponse(body);

        assertThat(createdResponse.getStatusCode()).isEqualTo(SC_OK);
    }

}
