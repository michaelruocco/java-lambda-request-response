package uk.co.mruoc.lambda;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class LambdaResponse {

    private int statusCode;
    private String body = EMPTY;
    private Map<String, String> headers = new HashMap<>();

    public LambdaResponse() {
        // intentionally blank
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void addHeader(String name, String value) {
        this.headers.put(name, value);
    }

    public String getHeader(String name) {
        if (headers.containsKey(name))
            return headers.get(name);
        return EMPTY;
    }

}
