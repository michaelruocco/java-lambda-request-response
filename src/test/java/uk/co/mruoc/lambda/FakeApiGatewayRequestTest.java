package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FakeApiGatewayRequestTest {

    @Test
    public void shouldCreateRequestWithPathParameter() {
        String key = "custom-param";
        String value = "my-value";

        FakeApiGatewayRequest request = new FakeApiGatewayRequest().withPathParameter(key, value);

        assertThat(request.getPathParameter(key)).isEqualTo(value);
    }

    @Test
    public void shouldCreateRequestWithId() {
        String id = "my-id";

        FakeApiGatewayRequest request = new FakeApiGatewayRequest().withId(id);

        assertThat(request.getId()).isEqualTo(id);
    }

    @Test
    public void shouldCreateRequestWithBody() {
        String body = "some body";

        FakeApiGatewayRequest request = new FakeApiGatewayRequest().withBody(body);

        assertThat(request.getBody()).isEqualTo(body);
    }

}
