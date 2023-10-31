package cylinder;

//Main class shows how the inheritance hierarchy works
// by accessing and using the properties and methods of Circle and Cylinder classes.
// It calculates and displays the properties and areas of circles and cylinders, including their volumes.
public class Main {
    public static void main(String[] args) {
        //Test Code
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
    }
}// Run the program