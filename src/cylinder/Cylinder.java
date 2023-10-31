package cylinder;

//Cylinder class - child class
//This means that Cylinder inherits properties and methods from its parent class, Circle.
public class Cylinder extends Circle {
    //Private instance variable
    private double height;
    //Constructor with parameters

    public Cylinder(double radius, double height) {
        super(radius);//to invoke the constructor of the parent class, Circle, to set the radius of the cylinder.
        //ternary operator to check the parameter is less than 0
        //if not than it assigns the provided value
        this.height = height < 0 ? 0 : height;
    }
    //Instance methods

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}