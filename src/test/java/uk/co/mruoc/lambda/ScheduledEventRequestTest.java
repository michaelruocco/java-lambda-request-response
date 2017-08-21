package uk.co.mruoc.lambda;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScheduledEventRequestTest {

    private final ScheduledEventRequest request = new ScheduledEventRequest();

    @Test
    public void accountShouldDefaultToEmpty() {
        assertThat(request.getAccount()).isEmpty();
    }

    @Test
    public void shouldSetAccount() {
        String account = "my-account";

        request.setAccount(account);

        assertThat(request.getAccount()).isEqualTo(account);
    }

    @Test
    public void regionShouldDefaultToEmpty() {
        assertThat(request.getRegion()).isEmpty();
    }

    @Test
    public void shouldSetRegion() {
        String region = "my-region";

        request.setRegion(region);

        assertThat(request.getRegion()).isEqualTo(region);
    }

    @Test
    public void detailShouldDefaultToNull() {
        assertThat(request.getDetail()).isNull();
    }

    @Test
    public void shouldSetDetail() {
        Detail detail = new Detail();

        request.setDetail(detail);

        assertThat(request.getDetail()).isEqualTo(detail);
    }

    @Test
    public void detailTypeShouldDefaultToEmpty() {
        assertThat(request.getDetailType()).isEmpty();
    }

    @Test
    public void shouldSetDetailType() {
        String detailType = "my-detail-type";

        request.setDetailType(detailType);

        assertThat(request.getDetailType()).isEqualTo(detailType);
    }

    @Test
    public void sourceShouldDefaultToEmpty() {
        assertThat(request.getSource()).isEmpty();
    }

    @Test
    public void shouldSetSource() {
        String source = "my-source";

        request.setSource(source);

        assertThat(request.getSource()).isEqualTo(source);
    }

    @Test
    public void timeShouldDefaultToNull() {
        assertThat(request.getTime()).isNull();
    }

    @Test
    public void shouldSetTime() {
        LocalDateTime time = LocalDateTime.now();

        request.setTime(time);

        assertThat(request.getTime()).isEqualTo(time);
    }

    @Test
    public void idShouldDefaultToEmpty() {
        assertThat(request.getId()).isEmpty();
    }

    @Test
    public void shouldSetId() {
        String id = "my-id";

        request.setId(id);

        assertThat(request.getId()).isEqualTo(id);
    }

    @Test
    public void resourcesShouldDefaultToEmpty() {
        assertThat(request.getResources()).isEmpty();
    }

    @Test
    public void shouldSetResources() {
        List<String> resources = Arrays.asList("my-resource");

        request.setResources(resources);

        assertThat(request.getResources()).isEqualTo(resources);
    }

}
