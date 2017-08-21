package uk.co.mruoc.lambda;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

public class LambdaResponseTest {

    private final LambdaResponse response = new LambdaResponse();

    @Test
    public void shouldReturnStatusCode() {
        int statusCode = 200;
        response.setStatusCode(statusCode);

        assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }

    @Test
    public void shouldReturnBody() {
        String body = "body";
        response.setBody(body);

        assertThat(response.getBody()).isEqualTo(body);
    }

    @Test
    public void shouldReturnHeaders() {
        Map<String, String> headers = new HashMap<>();
        response.setHeaders(headers);

        assertThat(response.getHeaders()).isEqualTo(headers);
    }

    @Test
    public void shouldReturnHeader() {
        String name = "header-name";
        String value = "header-value";
        response.addHeader(name, value);

        assertThat(response.getHeader(name)).isEqualTo(value);
    }

    @Test
    public void shouldReturnEmptyStringIfHeaderNotSet() {
        String name = "header-name";

        assertThat(response.getHeader(name)).isEqualTo(EMPTY);
    }

}
