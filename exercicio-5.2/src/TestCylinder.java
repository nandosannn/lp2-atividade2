import model.Cylinder;

public class TestCylinder {
    public static void main(String[] args) throws Exception {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c1.getBase().getRadius(), c1.getHeight(), c1.getBase().getArea(), c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c2.getBase().getRadius(), c2.getHeight(), c2.getBase().getArea(), c2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.printf("Cylinder: radius=%.2f height=%.2f base area=%.2f volume=%.2f%n",
            c3.getBase().getRadius(), c3.getHeight(), c3.getBase().getArea(), c3.getVolume());
    }
}
