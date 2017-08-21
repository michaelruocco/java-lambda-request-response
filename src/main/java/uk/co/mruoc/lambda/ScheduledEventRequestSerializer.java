package uk.co.mruoc.lambda;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ScheduledEventRequestSerializer implements JsonSerializer<ScheduledEventRequest> {

    private final Gson gson = new Gson();

    @Override
    public JsonElement serialize(ScheduledEventRequest event, Type type, JsonSerializationContext context) {
        JsonObject json = new JsonObject();
        json.addProperty("account", event.getAccount());
        json.addProperty("region", event.getRegion());
        json.addProperty("detail", gson.toJson(event.getDetail()));
        json.addProperty("detailType", event.getDetailType());
        json.addProperty("source", event.getSource());
        json.addProperty("time", event.getTime().toString());
        json.addProperty("id", event.getId());
        json.add("resources", gson.toJsonTree(event.getResources()));
        return json;
    }

}
