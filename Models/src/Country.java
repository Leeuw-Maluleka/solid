import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Country implements Area {
    public List<Area> Provinces;

    public Country(List<Area> areas) {
        Provinces = areas;
    }

    public List<Area> GetAreas() {

        return Provinces;
    }

    @Override
    public String GetName() {
        return null;
    }
}
