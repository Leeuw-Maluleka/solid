import java.util.List;

public interface Area {
    Location GetLocation();

    List<Area> GetAreas();

    public String GetName();
}
