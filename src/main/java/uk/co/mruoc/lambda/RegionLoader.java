package uk.co.mruoc.lambda;

import com.amazonaws.regions.Regions;
import org.apache.commons.lang3.StringUtils;

public class RegionLoader {

    private static final Regions DEFAULT_REGION = Regions.EU_WEST_1;

    public static Regions load() {
        String region = System.getProperty("region");
        if (StringUtils.isEmpty(region))
            return DEFAULT_REGION;
        return Regions.fromName(region);
    }

}
