package uk.co.mruoc.lambda;

import com.google.gson.JsonObject;

public class ErrorLambdaResponse extends LambdaResponse {

    public void setErrorMessage(String message) {
        String json = toJson(message);
        setBody(json);
    }

    private String toJson(String message) {
        JsonObject json = new JsonObject();
        json.addProperty("message", message);
        return json.toString();
    }

}
