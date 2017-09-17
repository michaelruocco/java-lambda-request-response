package uk.co.mruoc.lambda;

import com.amazonaws.regions.Regions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiEndpointBuilderTest {

    private final ApiEndpointBuilder builder = new ApiEndpointBuilder();

    @Test
    public void shouldBuildEndpoint() {
        builder.setId("my-id").setStage("my-stage").setRegion(Regions.US_EAST_2);

        String endpoint = builder.build();

        assertThat(endpoint).isEqualTo("https://my-id.execute-api.us-east-2.amazonaws.com/my-stage");
    }

}
