package carpet_cost_calculator;

public class Floor {
    // Private Instance variables
    private double width, length;

    //Constructor to initialize the width and length, ensuring they are non-negative
    public Floor(double width, double length) {
        //a ternary conditional (? :) operator to check if the parameters are less than 0.
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }
    // Instance method is used to calculate and retrieve the area of the floor.

    public double getArea() {
        return width * length;
    }
}