package uk.co.mruoc.lambda;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.RestoreSystemProperties;

import static com.amazonaws.regions.Regions.EU_WEST_1;
import static com.amazonaws.regions.Regions.US_EAST_2;
import static org.assertj.core.api.Assertions.assertThat;

public class RegionLoaderTest {

    @Rule
    public final RestoreSystemProperties properties = new RestoreSystemProperties();

    @Test
    public void shouldReturnConfiguredRegion() {
        System.setProperty("region", "us-east-2");

        assertThat(RegionLoader.load()).isEqualTo(US_EAST_2);
    }

    @Test
    public void shouldReturnDefaultRegionIfRegionNotConfigured() {
        System.setProperty("region", "");

        assertThat(RegionLoader.load()).isEqualTo(EU_WEST_1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfInvalidRegionConfigured() {
        System.setProperty("region", "invalid");

        RegionLoader.load();
    }

}
