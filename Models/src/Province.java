import java.util.Arrays;
import java.util.List;

public class Province implements Area{
    public static List<Region> Regions = Arrays.asList(new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region()
            ,new Region());

    @Override
    public Location GetLocation() {
        return null;
    }

    @Override
    public List<Area> GetAreas() {
        return null;
    }

    @Override
    public String GetName() {
        return null;
    }
}
