package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.apache.http.HttpStatus.SC_NO_CONTENT;
import static org.assertj.core.api.Assertions.assertThat;

public class NoContentLambdaResponseTest {

    private final LambdaResponse response = new NoContentLambdaResponse();

    @Test
    public void statusCodeShouldDefaultToNoContent() {
        assertThat(response.getStatusCode()).isEqualTo(SC_NO_CONTENT);
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
