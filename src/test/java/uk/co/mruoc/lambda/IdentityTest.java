package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IdentityTest {

    private final Identity identity = new Identity();

    @Test
    public void shouldSetCognitoIdentityPoolId() {
        String cognitoIdentityPoolId = "cognito_identity_pool_id";

        identity.setCognitoIdentityPoolId(cognitoIdentityPoolId);

        assertThat(identity.getCognitoIdentityPoolId()).isEqualTo(cognitoIdentityPoolId);
    }

    @Test
    public void shouldSetAccountId() {
        String accountId = "account_id";

        identity.setAccountId(accountId);

        assertThat(identity.getAccountId()).isEqualTo(accountId);
    }

    @Test
    public void shouldSetCognitoIdentityId() {
        String cognitoIdentityId = "cognito_identity_id";

        identity.setCognitoIdentityId(cognitoIdentityId);

        assertThat(identity.getCognitoIdentityId()).isEqualTo(cognitoIdentityId);
    }

    @Test
    public void shouldSetCaller() {
        String caller = "caller";

        identity.setCaller(caller);

        assertThat(identity.getCaller()).isEqualTo(caller);
    }

    @Test
    public void shouldSetApiKey() {
        String apiKey = "apiKey";

        identity.setApiKey(apiKey);

        assertThat(identity.getApiKey()).isEqualTo(apiKey);
    }

    @Test
    public void shouldSetSourceIp() {
        String sourceIp = "sourceIp";

        identity.setSourceIp(sourceIp);

        assertThat(identity.getSourceIp()).isEqualTo(sourceIp);
    }

    @Test
    public void shouldSetCognitoAuthenticationType() {
        String cognitoAuthenticationType = "cognitoAuthenticationType";

        identity.setCognitoAuthenticationType(cognitoAuthenticationType);

        assertThat(identity.getCognitoAuthenticationType()).isEqualTo(cognitoAuthenticationType);
    }

    @Test
    public void shouldSetCognitoAuthenticationProvider() {
        String cognitoAuthenticationProvider = "cognitoAuthenticationProvider";

        identity.setCognitoAuthenticationProvider(cognitoAuthenticationProvider);

        assertThat(identity.getCognitoAuthenticationProvider()).isEqualTo(cognitoAuthenticationProvider);
    }

    @Test
    public void shouldSetUserArn() {
        String userArn = "userArn";

        identity.setUserArn(userArn);

        assertThat(identity.getUserArn()).isEqualTo(userArn);
    }

    @Test
    public void shouldSetUserAgent() {
        String userAgent = "userAgent";

        identity.setUserAgent(userAgent);

        assertThat(identity.getUserAgent()).isEqualTo(userAgent);
    }

    @Test
    public void shouldSetUser() {
        String user = "user";

        identity.setUser(user);

        assertThat(identity.getUser()).isEqualTo(user);
    }

}
