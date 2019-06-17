import java.text.DecimalFormat;
import java.util.Scanner;

public class Shape
{
    public static void main (String[] arguments)
    {
        int Option;
        double Edge = 0;
        double Volume;
        double NewEdge;

        var scanner = new Scanner(System.in);

        Cube _cube = new Cube(Edge);
        Sphere _sphere = new Sphere(Edge);
        Tetrahedron _tetrahedron = new Tetrahedron(Edge);

        System.out.println("This is a volume calculator.");
        System.out.println("To calculate the volume for a certain shape enter in its corresponding number");
        System.out.println("1 = Cube");
        System.out.println("2 = Sphere");
        System.out.println("3 = Tetrahedron");
        Option = scanner.nextInt();

        DecimalFormat twoDecimalPlaces = new DecimalFormat("0.00");
        String volumeTwoDecimalPlaces;

        switch(Option)
        {
            // Cube
            case 1:
                System.out.println("Enter in the cube's edge size: ");
                NewEdge = scanner.nextDouble();
                _cube.setEdge(NewEdge);
                Volume = _cube.getVolume();
                volumeTwoDecimalPlaces = twoDecimalPlaces.format(Volume);
                System.out.println("Volume of cube: " + volumeTwoDecimalPlaces);
                break;

            // Sphere
            case 2:
                System.out.println("Enter in the spheres's radius size: ");
                NewEdge = scanner.nextDouble();
                _sphere.setRadius(NewEdge);
                Volume = _sphere.getVolume();
                volumeTwoDecimalPlaces = twoDecimalPlaces.format(Volume);
                System.out.println("Volume of sphere: " + volumeTwoDecimalPlaces);
                break;

            // Tetrahedron
            case 3:
                System.out.println("Enter in the tetrahedron's edge size: ");
                NewEdge = scanner.nextDouble();
                _tetrahedron.setEdge(NewEdge);
                Volume = _tetrahedron.getVolume();
                volumeTwoDecimalPlaces = twoDecimalPlaces.format(Volume);
                System.out.println("Volume of tetrahedron: " + volumeTwoDecimalPlaces);
                break;
        }
    }
}