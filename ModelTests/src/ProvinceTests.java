import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProvinceTests {
    @Test
    void GiveAProvinceWith10RegionsReturns10Regions() {
        List<Region> regions = Province.Regions;
        assertEquals(10, regions.size());
    }
}
