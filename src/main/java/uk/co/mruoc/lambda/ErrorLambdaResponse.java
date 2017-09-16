package uk.co.mruoc.lambda;

import com.google.gson.JsonObject;

public class ErrorLambdaResponse extends LambdaResponse {

    public ErrorLambdaResponse() {
        // intentionally blank
    }

    public ErrorLambdaResponse(String message) {
        setErrorMessage(message);
    }

    public void setErrorMessage(String message) {
        String json = toJson(message);
        setBody(json);
    }

    private static String toJson(String message) {
        JsonObject json = new JsonObject();
        json.addProperty("message", message);
        return json.toString();
    }

}
