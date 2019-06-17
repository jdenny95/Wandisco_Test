public class Tetrahedron extends ThreeDimensionalShape
{
    private double edge;

    public Tetrahedron(double edge)
    {
        this.edge = edge;
    }

    // Set Edge
    public void setEdge(double edge)
    {
        this.edge = edge;
    }

    // Get edge
    public double getEdge()
    {
        return edge;
    }

    @Override
    public double getVolume()
    {
        return Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }
}