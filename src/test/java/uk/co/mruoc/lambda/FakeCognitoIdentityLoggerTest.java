package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FakeCognitoIdentityLoggerTest {

    private final FakeCognitoIdentity identity = new FakeCognitoIdentity();

    @Test
    public void shouldSetId() {
        String id = "my-id";

        identity.setIdentityId(id);

        assertThat(identity.getIdentityId()).isEqualTo(id);
    }

    @Test
    public void shouldSetPoolId() {
        String poolId = "my-id";

        identity.setIdentityPoolId(poolId);

        assertThat(identity.getIdentityPoolId()).isEqualTo(poolId);
    }

}
