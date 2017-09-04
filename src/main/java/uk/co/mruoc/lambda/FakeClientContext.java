package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.Client;
import com.amazonaws.services.lambda.runtime.ClientContext;

import java.util.Map;

public class FakeClientContext implements ClientContext {

    private Client client;
    private Map<String, String> custom;
    private Map<String, String> environment;

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public Map<String, String> getCustom() {
        return custom;
    }

    @Override
    public Map<String, String> getEnvironment() {
        return environment;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCustom(Map<String, String> custom) {
        this.custom = custom;
    }

    public void setEnvironment(Map<String, String> environment) {
        this.environment = environment;
    }

}
