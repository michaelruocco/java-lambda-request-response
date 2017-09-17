package uk.co.mruoc.lambda;

import com.amazonaws.regions.Regions;

public class BaseEndpointFinder implements EndpointFinder {

    private final String stage;
    private final Regions region;
    private final String apiId;

    public BaseEndpointFinder(ApiNameConverter apiNameConverter, String stage, Regions region, String name) {
        this.stage = stage;
        this.region = region;
        this.apiId = apiNameConverter.toId(stage, name);
    }

    public String find() {
        return new ApiEndpointBuilder()
                .setId(apiId)
                .setRegion(region)
                .setStage(stage)
                .build();
    }

}
