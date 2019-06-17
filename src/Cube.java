public class Cube extends ThreeDimensionalShape
{
    private double edge;

    public Cube(double edge)
    {
        this.edge = edge;
    }

    public void setEdge(double edge)
    {
        this.edge = edge;
    }

    public double getEdge()
    {
        return edge;
    }

    @Override
    public double getVolume()
    {
        return Math.pow(getEdge(), 3);
    }
}