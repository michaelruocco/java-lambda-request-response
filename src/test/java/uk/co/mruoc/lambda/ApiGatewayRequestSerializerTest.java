package uk.co.mruoc.lambda;

import com.google.gson.JsonElement;
import org.junit.Test;
import uk.co.mruoc.properties.ClasspathFileContentLoader;
import uk.co.mruoc.properties.FileContentLoader;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiGatewayRequestSerializerTest {

    private final FileContentLoader contentLoader = new ClasspathFileContentLoader();
    private final ApiGatewayRequestSerializer serializer = new ApiGatewayRequestSerializer();

    @Test
    public void shouldSerializeApiGatewayRequest() {
        ApiGatewayRequest request = new FakeApiGatewayRequest();

        JsonElement element = serializer.serialize(request,null, null);

        assertThat(element.toString()).isEqualToIgnoringWhitespace(expectedJson());
    }

    private String expectedJson() {
        return contentLoader.loadContent("/apiGatewayRequest.json");
    }

}
