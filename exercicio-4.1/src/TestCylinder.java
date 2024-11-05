import model.Cylinder;

public class TestCylinder {
    public static void main(String[] args) throws Exception {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c1.getRadius(), c1.getHeight(), c1.getArea(), c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c2.getRadius(), c2.getHeight(), c2.getArea(), c2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c3.getRadius(), c3.getHeight(), c3.getArea(), c3.getVolume());
    }
}
