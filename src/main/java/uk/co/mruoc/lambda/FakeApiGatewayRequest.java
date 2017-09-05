package uk.co.mruoc.lambda;

import java.util.HashMap;
import java.util.Map;

public class FakeApiGatewayRequest extends ApiGatewayRequest {

    public FakeApiGatewayRequest withId(String id) {
        Map<String, String> pathParameters = new HashMap<>();
        pathParameters.put("id", id);
        setPathParameters(pathParameters);
        return this;
    }

    public FakeApiGatewayRequest withBody(String body) {
        setBody(body);
        return this;
    }

}
