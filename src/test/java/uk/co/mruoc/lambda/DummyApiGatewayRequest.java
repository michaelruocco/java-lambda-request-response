package uk.co.mruoc.lambda;

import java.util.HashMap;
import java.util.Map;

public class DummyApiGatewayRequest extends ApiGatewayRequest {

    public DummyApiGatewayRequest() {
        setResource("my-resource");
        setPath("my-path/param1/param2");
        setHttpMethod("GET");
        setHeaders(createHeaders());
        setPathParameters(createPathParameters());
        setStageVariables(createStageVariables());
        setRequestContext(createRequestContext());
        setBody("my-body");
        setBase64Encoded(true);
    }

    private static Map<String, String> createHeaders() {
        Map<String,String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        return headers;
    }

    private static Map<String, String> createPathParameters() {
        Map<String,String> params = new HashMap<>();
        params.put("param1", "value1");
        params.put("param2", "value2");
        return params;
    }

    private static Map<String, String> createStageVariables() {
        Map<String,String> variables = new HashMap<>();
        variables.put("var1", "value1");
        variables.put("var2", "value2");
        return variables;
    }

    private static RequestContext createRequestContext() {
        RequestContext context = new RequestContext();
        context.setAccountId("my-account-id");
        context.setResourceId("my-resource-id");
        context.setStage("my-stage");
        context.setRequestId("my-request-id");
        context.setIdentity(createIdentity());
        context.setResourcePath("my-resource-path");
        context.setHttpMethod("GET");
        context.setApiId("my-api-id");
        return context;
    }

    private static Identity createIdentity() {
        Identity identity = new Identity();
        identity.setCognitoIdentityPoolId("my-cognito-identity-pool-id");
        identity.setAccountId("my-account-id");
        identity.setCognitoIdentityId("my-cognito-identity-id");
        identity.setCaller("my-caller");
        identity.setApiKey("my-api-key");
        identity.setSourceIp("my-source-ip");
        identity.setCognitoAuthenticationType("my-cognito-authentication-type");
        identity.setCognitoAuthenticationProvider("my-cognito-authentication-provider");
        identity.setUserArn("my-user-arn");
        identity.setUserAgent("my-user-agent");
        identity.setUser("my-user");
        return identity;
    }
}
