package uk.co.mruoc.lambda;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FakeScheduledEventRequest extends ScheduledEventRequest {

    public FakeScheduledEventRequest() {
        setAccount("my-account");
        setRegion("my-region");
        setDetail(new Detail());
        setDetailType("my-detail-type");
        setSource("my-source");
        setTime(LocalDateTime.of(2017, 8, 21, 6, 5, 8, 0));
        setId("my-id");
        setResources(Arrays.asList("resource1", "resource2"));
    }

}
