import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CountryTests {
    @Test
    void givenACountryWith9ProvincesReturn9Provinces(){
        List<Area> areas = Arrays.asList(new Province()
                , new Province()
                , new Province()
                , new Province()
                , new Province()
                , new Province()
                , new Province()
                , new Province()
                , new Province());
        Country country = new Country(areas, null);
        List<Area> provinces = country.Provinces;
        assertEquals(9,provinces.size());
    }

    @Test
    void GivenACountryWithALocationThenReturnGpsLocation() {
        Location location = new GpsLocation();
        Country country = new Country(null, location);
        Location gpsLocation = country.GetLocation();
        assertNotNull(gpsLocation);
    }
}
