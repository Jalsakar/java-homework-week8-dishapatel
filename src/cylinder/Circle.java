package cylinder;

//Circle class - parent class
public class Circle {
    //Private instance variable
    private double radius;

    //Constructor with parameter to initialize the radius of the circle.
    public Circle(double radius) {
        //if...else loop
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;// the radius parameter is less than 0 it needs to set the radius field value to 0
        }
    }
    //Instance method named getRadius without any parameters, it needs to return the value of the radius field.

    public double getRadius() {
        return radius;
    }
    //Instance method named getArea without any parameters, it needs to return the calculated area
    //(radius * radius * PI). For PI use Math.PI constant.

    public double getArea() {
        return Math.PI * radius * radius;//calculation of area
    }
}