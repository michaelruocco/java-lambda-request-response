package uk.co.mruoc.lambda;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ApiGatewayRequestSerializer implements JsonSerializer<ApiGatewayRequest> {

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(ApiGatewayRequest request, Type type, JsonSerializationContext context) {
        JsonObject json = new JsonObject();
        json.addProperty("resource", request.getResource());
        json.addProperty("path", request.getPath());
        json.addProperty("httpMethod", request.getHttpMethod());

        json.add("headers", gson.toJsonTree(request.getHeaders()));
        json.add("queryStringParameters", gson.toJsonTree(request.getQueryStringParameters()));
        json.add("pathParameters", gson.toJsonTree(request.getPathParameters()));
        json.add("stageVariables", gson.toJsonTree(request.getStageVariables()));

        json.add("requestContext", gson.toJsonTree(request.getRequestContext()));
        json.addProperty("body", request.getBody());
        json.addProperty("isBase64Encoded", request.isBase64Encoded());
        return json;
    }

}
