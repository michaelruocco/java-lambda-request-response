package uk.co.mruoc.lambda;

import com.google.gson.JsonElement;
import org.junit.Test;
import uk.co.mruoc.properties.ClasspathFileContentLoader;
import uk.co.mruoc.properties.FileContentLoader;

import static org.assertj.core.api.Assertions.assertThat;

public class ScheduledEventRequestSerializerTest {

    private final FileContentLoader contentLoader = new ClasspathFileContentLoader();
    private final ScheduledEventRequestSerializer serializer = new ScheduledEventRequestSerializer();

    @Test
    public void shouldSerializeApiGatewayRequest() {
        ScheduledEventRequest request = new FakeScheduledEventRequest();

        JsonElement element = serializer.serialize(request,null, null);

        assertThat(element.toString()).isEqualToIgnoringWhitespace(expectedJson());
    }

    private String expectedJson() {
        return contentLoader.loadContent("/scheduledEventRequest.json");
    }

}
