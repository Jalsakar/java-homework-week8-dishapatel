package pool_area;

//Cuboid class - child class
public class Cuboid extends Rectangle {
    // initializing the instance variable with data type
    double height;

    //constructor with three parameters
    public Cuboid(double width, double length, double height) {
        super(width, length);//calling parent constructor
        // the height parameter is less than 0 it needs to set the height field value to 0.
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Instance method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return height;
    }

    //Instance method named getVolume without any parameters, it needs to return the calculated volume.
    //To calculate volume, multiply the area with height.
    public double getVolume() {
        return getArea() * height;
    }
}