import java.util.List;

public class Country implements Area {
    public List<Area> Provinces;
    public Location Location;

    public Country(List<Area> areas, Location location) {
        Provinces = areas;
        Location = location;
    }

    public Location GetLocation() {
        return this.Location;
    }

    public List<Area> GetAreas() {

        return Provinces;
    }

    @Override
    public String GetName() {
        return null;
    }
}
