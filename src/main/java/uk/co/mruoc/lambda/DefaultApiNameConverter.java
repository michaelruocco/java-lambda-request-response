package uk.co.mruoc.lambda;

import com.amazonaws.services.apigateway.AmazonApiGateway;
import com.amazonaws.services.apigateway.model.GetRestApisRequest;
import com.amazonaws.services.apigateway.model.GetRestApisResult;
import com.amazonaws.services.apigateway.model.RestApi;

import java.util.List;

public class DefaultApiNameConverter implements ApiNameConverter {

    private final AmazonApiGateway gateway;

    public DefaultApiNameConverter(AmazonApiGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public String toId(String stage, String name) {
        return toId(stage + "-" + name);
    }

    @Override
    public String toId(String name) {
        List<RestApi> apis = getAllApis();
        return extractId(apis, name);
    }

    private List<RestApi> getAllApis() {
        GetRestApisRequest request = new GetRestApisRequest();
        GetRestApisResult result = gateway.getRestApis(request);
        return result.getItems();
    }

    private String extractId(List<RestApi> apis, String name) {
        for (RestApi api : apis)
            if (api.getName().equals(name))
                return api.getId();
        throw new ApiNotFoundException("no api found with name " + name);
    }

}
