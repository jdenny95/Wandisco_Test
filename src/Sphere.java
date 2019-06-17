public class Sphere extends ThreeDimensionalShape
{
    private double radius;
    private double pi = Math.PI;

    public Sphere(double radius)
    {
        this.radius = radius;
    }

    // Set radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    // Get radius
    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getVolume()
    {
        return (4 * pi * Math.pow(getRadius(), 3)) / 3;
    }
}