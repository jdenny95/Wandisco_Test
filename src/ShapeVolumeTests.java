import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

class ShapeVolumeTests
{
    private double edge;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    Cube _cube = new Cube(edge);
    Sphere _sphere = new Sphere(edge);
    Tetrahedron _tetrahedron = new Tetrahedron(edge);

    @Test
    public void getVolume_CubeEdgeIsOne_IsEqualTo()
    {
        _cube.setEdge(1);
        var volume = decimalFormat.format(_cube.getVolume());

        assertEquals("1.00", volume);
    }

    @Test
    public void getVolume_CubeEdgeIsFive_IsEqualTo()
    {
        _cube.setEdge(5);
        var volume = decimalFormat.format(_cube.getVolume());

        assertEquals("125.00", volume);
    }

    @Test
    public void getVolume_SphereRadiusIsOne_IsEqualTo()
    {
        _sphere.setRadius(1);
        var volume = decimalFormat.format(_sphere.getVolume());

        assertEquals("4.19", volume);
    }

    @Test
    public void getVolume_SphereRadiusIsFive_IsEqualTo()
    {
        _sphere.setRadius(5);
        var volume = decimalFormat.format(_sphere.getVolume());

        assertEquals("523.60", volume);
    }

    @Test
    public void getVolume_TetrahedronEdgeIsOne_IsEqualTo()
    {
        _tetrahedron.setEdge(1);
        var volume = decimalFormat.format(_tetrahedron.getVolume());

        assertEquals("0.12", volume);
    }

    @Test
    public void getVolume_TetrahedronEdgeIsFive_IsEqualTo()
    {
        _tetrahedron.setEdge(5);
        var volume = decimalFormat.format(_tetrahedron.getVolume());

        assertEquals("14.73", volume);
    }
}