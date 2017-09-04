package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.Client;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FakeClientContextTest {

    private final FakeClientContext context = new FakeClientContext();

    @Test
    public void shouldSetClient() {
        Client client = new FakeClient();

        context.setClient(client);

        assertThat(context.getClient()).isEqualTo(client);
    }

    @Test
    public void shouldSetCustom() {
        Map<String, String> custom = new HashMap<>();

        context.setCustom(custom);

        assertThat(context.getCustom()).isEqualTo(custom);
    }

    @Test
    public void shouldSetEnvironment() {
        Map<String, String> environment = new HashMap<>();

        context.setEnvironment(environment);

        assertThat(context.getEnvironment()).isEqualTo(environment);
    }

}
