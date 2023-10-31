package pool_area;

//Rectangle class - parent class
public class Rectangle {
    //initializing two instance variable with double data type
    double width;
    double length;

    //constructor with two parameters
    public Rectangle(double width, double length) {
        // initialize the value for variable
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    //Instance method named getWidth without any parameters, it needs to return the value of the width field.
    public double getWidth() {
        return width;
    }

    //Instance method named getLength without any parameters, it needs to return the value of the length field.
    public double getLength() {
        return length;
    }

    //Instance method named getArea without any parameters, it needs to return the calculated area (width * length).
    public double getArea() {
        double area;
        area = width * length; // calculation of area
        return area;
    }
}