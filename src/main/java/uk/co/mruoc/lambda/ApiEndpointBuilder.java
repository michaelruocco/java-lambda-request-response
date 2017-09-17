package uk.co.mruoc.lambda;

import com.amazonaws.regions.Regions;

public class ApiEndpointBuilder {

    private String id;
    private String stage;
    private Regions region;

    public String build() {
        return "https://" + id + ".execute-api." + region.getName() + ".amazonaws.com/" + stage;
    }

    public ApiEndpointBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ApiEndpointBuilder setStage(String stage) {
        this.stage = stage;
        return this;
    }

    public ApiEndpointBuilder setRegion(Regions region) {
        this.region = region;
        return this;
    }

}
