package uk.co.mruoc.lambda;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiGatewayRequestTest {

    private ApiGatewayRequest request = new ApiGatewayRequest();

    @Test
    public void resourceShouldDefaultToEmpty() {
        assertThat(request.getResource()).isEmpty();
    }

    @Test
    public void shouldSetResource() {
        String resource = "resource";

        request.setResource(resource);

        assertThat(request.getResource()).isEqualTo(resource);
    }

    @Test
    public void pathShouldDefaultToEmpty() {
        assertThat(request.getPath()).isEmpty();
    }

    @Test
    public void shouldSetPath() {
        String path = "path";

        request.setPath(path);

        assertThat(request.getPath()).isEqualTo(path);
    }

    @Test
    public void httpMethodShouldDefaultToEmpty() {
        assertThat(request.getHttpMethod()).isEmpty();
    }

    @Test
    public void shouldSetHttpMethod() {
        String httpMethod = "httpMethod";

        request.setHttpMethod(httpMethod);

        assertThat(request.getHttpMethod()).isEqualTo(httpMethod);
    }

    @Test
    public void headersShouldDefaultToEmpty() {
        assertThat(request.getHeaders()).isEmpty();
    }

    @Test
    public void getHeaderShouldDefaultToEmptyIfHeadersAreNull() {
        request.setHeaders(null);

        assertThat(request.getHeader("my-header")).isEmpty();
    }

    @Test
    public void shouldSetHeaders() {
        Map<String, String> headers = new HashMap<>();

        request.setHeaders(headers);

        assertThat(request.getHeaders()).isEqualTo(headers);
    }

    @Test
    public void shouldReturnSpecificHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("my-header", "my-value");

        request.setHeaders(headers);

        assertThat(request.getHeader("my-header")).isEqualTo("my-value");
    }

    @Test
    public void shouldReturnEmptyIfHeaderDoesNotExist() {
        assertThat(request.getHeader("my-header")).isEmpty();
    }

    @Test
    public void hasHeaderShouldReturnFalseIfHeaderDoesNotExist() {
        assertThat(request.hasHeader("Content-Type")).isFalse();
    }

    @Test
    public void hasHeaderShouldReturnTrueIfHeaderExists() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        request.setHeaders(headers);

        assertThat(request.hasHeader("Content-Type")).isTrue();
    }

    @Test
    public void shouldReturnContentTypeHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        request.setHeaders(headers);

        assertThat(request.getContentType()).isEqualTo("application/json");
    }

    @Test
    public void contentTypeShouldDefaultToEmpty() {
        assertThat(request.getContentType()).isEmpty();
    }

    @Test
    public void queryStringParametersShouldDefaultToEmpty() {
        assertThat(request.getQueryStringParameters()).isEmpty();
    }

    @Test
    public void shouldSetQueryStringParameters() {
        Map<String, String> queryStringParameters = new HashMap<>();

        request.setQueryStringParameters(queryStringParameters);

        assertThat(request.getQueryStringParameters()).isEqualTo(queryStringParameters);
    }

    @Test
    public void shouldReturnSpecificQueryStringParameter() {
        Map<String, String> queryStringParameters = new HashMap<>();
        queryStringParameters.put("my-param", "my-value");

        request.setQueryStringParameters(queryStringParameters);

        assertThat(request.getQueryStringParameter("my-param")).isEqualTo("my-value");
    }

    @Test
    public void pathParametersShouldDefaultToEmpty() {
        assertThat(request.getPathParameters()).isEmpty();
    }

    @Test
    public void shouldSetPathParameters() {
        Map<String, String> pathParameters = new HashMap<>();

        request.setPathParameters(pathParameters);

        assertThat(request.getPathParameters()).isEqualTo(pathParameters);
    }

    @Test
    public void shouldReturnSpecificPathParameter() {
        Map<String, String> pathParameters = new HashMap<>();
        pathParameters.put("my-param", "my-value");

        request.setPathParameters(pathParameters);

        assertThat(request.getPathParameter("my-param")).isEqualTo("my-value");
    }

    @Test
    public void shouldReturnPathParameterId() {
        String id = "1234";
        Map<String, String> pathParameters = new HashMap<>();
        pathParameters.put("id", id);

        request.setPathParameters(pathParameters);

        assertThat(request.getId()).isEqualTo(id);
    }

    @Test
    public void stageVariablesParametersShouldDefaultToEmpty() {
        assertThat(request.getStageVariables()).isEmpty();
    }

    @Test
    public void shouldSetStageVariables() {
        Map<String, String> stageVariables = new HashMap<>();

        request.setStageVariables(stageVariables);

        assertThat(request.getStageVariables()).isEqualTo(stageVariables);
    }

    @Test
    public void shouldReturnSpecificStageVariable() {
        Map<String, String> stageVariables = new HashMap<>();
        stageVariables.put("my-variable", "my-value");

        request.setStageVariables(stageVariables);

        assertThat(request.getStageVariable("my-variable")).isEqualTo("my-value");
    }

    @Test
    public void requestContextShouldDefaultToNull() {
        assertThat(request.getRequestContext()).isNull();
    }

    @Test
    public void shouldSetRequestContext() {
        RequestContext context = new RequestContext();

        request.setRequestContext(context);

        assertThat(request.getRequestContext()).isEqualTo(context);
    }

    @Test
    public void shouldReturnSourceIp() {
        String sourceIp = "sourceIp";
        RequestContext context = new RequestContext();
        Identity identity = new Identity();
        context.setIdentity(identity);
        identity.setSourceIp(sourceIp);

        request.setRequestContext(context);

        assertThat(request.getSourceIp()).isEqualTo(sourceIp);
    }

    @Test
    public void sourceIpShouldDefaultToEmpty() {
        assertThat(request.getSourceIp()).isEmpty();
    }

    @Test
    public void bodyShouldDefaultToEmpty() {
        assertThat(request.getBody()).isEmpty();
    }

    @Test
    public void shouldSetBody() {
        String body = "body";

        request.setBody(body);

        assertThat(request.getBody()).isEqualTo(body);
    }

    @Test
    public void isBase64EncodedShouldDefaultToEmpty() {
        assertThat(request.isBase64Encoded()).isFalse();
    }

    @Test
    public void shouldSetBase64Encoded() {
        request.setBase64Encoded(true);

        assertThat(request.isBase64Encoded()).isTrue();
    }

    @Test
    public void shouldReturnRequestId() {
        String requestId = "requestId";
        RequestContext context = new RequestContext();
        context.setRequestId(requestId);

        request.setRequestContext(context);

        assertThat(request.getRequestId()).isEqualTo(requestId);
    }

    @Test
    public void shouldReturnEmptyRequestIdIfRequestContextNotSet() {
        assertThat(request.getRequestId()).isEmpty();
    }

}
