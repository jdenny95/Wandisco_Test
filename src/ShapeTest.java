public class ShapeTest
{
    public static void main(String[] args)
    {
        // Test Fixture
        Shape shape[] = new Shape[3];
        shape[0] = new Sphere(1.0);
        shape[1] = new Cube(1.0);
        shape[2] = new Tetrahedron(1.0);

        for (Shape currentShape : shape) {
            System.out.println(currentShape);
            if (currentShape instanceof ThreeDimensionalShape)
            {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) currentShape;
                System.out.printf("Volume for " + threeDimensionalShape.toString() + "is " + threeDimensionalShape.getVolume());
            }
        }
    }
}