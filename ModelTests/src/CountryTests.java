import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountryTests {
    @Test
    void givenACountryWith9ProvincesReturn9Provinces(){
        List<Province> provinces = Country.Provinces;
        assertEquals(9,provinces.size());
    }
}
