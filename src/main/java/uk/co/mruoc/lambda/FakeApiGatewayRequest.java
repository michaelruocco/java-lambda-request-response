package uk.co.mruoc.lambda;

import java.util.HashMap;
import java.util.Map;

public class FakeApiGatewayRequest extends ApiGatewayRequest {

    public FakeApiGatewayRequest withId(String id) {
        return withPathParameter("id", id);
    }

    public FakeApiGatewayRequest withPathParameter(String key, String value) {
        Map<String, String> parameters = getPathParameters();
        parameters.put(key, value);
        return this;
    }

    public FakeApiGatewayRequest withBody(String body) {
        setBody(body);
        return this;
    }

}
