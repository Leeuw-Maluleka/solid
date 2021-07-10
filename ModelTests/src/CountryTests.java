import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Country country = new Country(areas);
        List<Area> provinces = country.Provinces;
        assertEquals(9,provinces.size());
    }
}
