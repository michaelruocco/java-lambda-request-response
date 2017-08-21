package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestContextTest {

    private final RequestContext requestContext = new RequestContext();

    @Test
    public void shouldReturnAccountId() {
        String accountId = "accountId";

        requestContext.setAccountId(accountId);

        assertThat(requestContext.getAccountId()).isEqualTo(accountId);
    }

    @Test
    public void shouldReturnResourceId() {
        String resourceId = "resourceId";

        requestContext.setResourceId(resourceId);

        assertThat(requestContext.getResourceId()).isEqualTo(resourceId);
    }

    @Test
    public void shouldReturnStage() {
        String stage = "stage";

        requestContext.setStage(stage);

        assertThat(requestContext.getStage()).isEqualTo(stage);
    }

    @Test
    public void shouldReturnRequestId() {
        String requestId = "requestId";

        requestContext.setRequestId(requestId);

        assertThat(requestContext.getRequestId()).isEqualTo(requestId);
    }

    @Test
    public void shouldReturnIdentity() {
        Identity identity = new Identity();

        requestContext.setIdentity(identity);

        assertThat(requestContext.getIdentity()).isEqualTo(identity);
    }

    @Test
    public void shouldReturnResoucePath() {
        String resourcePath = "resourcePath";

        requestContext.setResourcePath(resourcePath);

        assertThat(requestContext.getResourcePath()).isEqualTo(resourcePath);
    }

    @Test
    public void shouldReturnHttpMethod() {
        String httpMethod = "httpMethod";

        requestContext.setHttpMethod(httpMethod);

        assertThat(requestContext.getHttpMethod()).isEqualTo(httpMethod);
    }

    @Test
    public void shouldReturnApiId() {
        String apiId = "apiId";

        requestContext.setApiId(apiId);

        assertThat(requestContext.getApiId()).isEqualTo(apiId);
    }

    @Test
    public void shouldReturnEmptySourceIfIdentityNotSet() {
        assertThat(requestContext.getSourceIp()).isEmpty();
    }

    @Test
    public void shouldReturnSourceIp() {
        String sourceIp = "sourceIp";
        Identity identity = new Identity();
        identity.setSourceIp(sourceIp);

        requestContext.setIdentity(identity);

        assertThat(requestContext.getSourceIp()).isEqualTo(sourceIp);
    }

}
