package uk.co.mruoc.lambda;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class ApiGatewayRequest {

    private String resource = EMPTY;
    private String path = EMPTY;
    private String httpMethod = EMPTY;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> queryStringParameters = new HashMap<>();
    private Map<String, String> pathParameters = new HashMap<>();
    private Map<String, String> stageVariables = new HashMap<>();
    private RequestContext requestContext;
    private String body = EMPTY;
    private boolean isBase64Encoded;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public String getHeader(String key) {
        if (hasHeader(key))
            return headers.get(key);
        return EMPTY;
    }

    public String getQueryStringParameter(String key) {
        return queryStringParameters.get(key);
    }

    public String getPathParameter(String key) {
        return pathParameters.get(key);
    }

    public String getStageVariable(String key) {
        return stageVariables.get(key);
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getQueryStringParameters() {
        return queryStringParameters;
    }

    public void setQueryStringParameters(Map<String, String> queryStringParameters) {
        this.queryStringParameters = queryStringParameters;
    }

    public Map<String, String> getPathParameters() {
        return pathParameters;
    }

    public void setPathParameters(Map<String, String> pathParameters) {
        this.pathParameters = pathParameters;
    }

    public Map<String, String> getStageVariables() {
        return stageVariables;
    }

    public void setStageVariables(Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    public RequestContext getRequestContext() {
        return requestContext;
    }

    public void setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public String getId() {
        return pathParameters.get("id");
    }

    public String getContentType() {
        return getHeader("Content-Type");
    }

    public String getSourceIp() {
        if (hasRequestContext())
            return requestContext.getSourceIp();
        return EMPTY;
    }

    public String getRequestId() {
        if (hasRequestContext())
            return requestContext.getRequestId();
        return EMPTY;
    }

    private boolean hasRequestContext() {
        return requestContext != null;
    }

    private boolean hasHeader(String key) {
        return hasHeaders() && headers.containsKey(key);
    }

    private boolean hasHeaders() {
        return headers != null;
    }

}
