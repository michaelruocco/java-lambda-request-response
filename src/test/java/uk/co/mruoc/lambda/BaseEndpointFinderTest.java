package uk.co.mruoc.lambda;

import com.amazonaws.regions.Regions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseEndpointFinderTest {

    private static final String STAGE = "my-stage";
    private static final Regions REGION = Regions.EU_WEST_1;
    private static final String NAME = "api-name";
    private static final String ID = "api-id";
    private final FakeApiNameConverter converter = new FakeApiNameConverter();

    @Test
    public void shouldUseApiNameToFindApiId() {
        converter.setId(ID);

        new BaseEndpointFinder(converter, STAGE, REGION, NAME);

        assertThat(converter.getLastName()).isEqualTo(NAME);
    }

    @Test
    public void shouldUseStageToFindApiId() {
        converter.setId(ID);

        new BaseEndpointFinder(converter, STAGE, REGION, NAME);

        assertThat(converter.getLastStage()).isEqualTo(STAGE);
    }

    @Test
    public void shouldFindEndpoint() {
        converter.setId(ID);

        EndpointFinder finder = new BaseEndpointFinder(converter, STAGE, REGION, NAME);

        assertThat(finder.find()).isEqualTo("https://api-id.execute-api.eu-west-1.amazonaws.com/my-stage");
    }

}
