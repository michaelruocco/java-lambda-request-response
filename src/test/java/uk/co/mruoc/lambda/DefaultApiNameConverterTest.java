package uk.co.mruoc.lambda;

import com.amazonaws.services.apigateway.AmazonApiGateway;
import com.amazonaws.services.apigateway.model.GetRestApisRequest;
import com.amazonaws.services.apigateway.model.GetRestApisResult;
import com.amazonaws.services.apigateway.model.RestApi;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

public class DefaultApiNameConverterTest {

    private final AmazonApiGateway gateway = mock(AmazonApiGateway.class);

    private final DefaultApiNameConverter converter = new DefaultApiNameConverter(gateway);

    @Test
    public void shouldConvertNameAndStageToId() {
        RestApi api1 = new RestApi().withId("id1").withName("dev-name1");
        RestApi api2 = new RestApi().withId("id2").withName("dev-name2");
        GetRestApisResult result = new GetRestApisResult().withItems(api1, api2);
        given(gateway.getRestApis(any(GetRestApisRequest.class))).willReturn(result);

        String id = converter.toId("dev", "name2");

        assertThat(id).isEqualTo(api2.getId());
    }

    @Test(expected = ApiNotFoundException.class)
    public void shouldThrowExceptionIfApiNotFound() {
        RestApi api1 = new RestApi().withId("id1").withName("notFound1");
        RestApi api2 = new RestApi().withId("id2").withName("notFound2");
        GetRestApisResult result = new GetRestApisResult().withItems(api1, api2);
        given(gateway.getRestApis(any(GetRestApisRequest.class))).willReturn(result);

        converter.toId("dev", "name2");
    }

}
