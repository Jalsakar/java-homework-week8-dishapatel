package carpet_cost_calculator;

public class Carpet {
    //A private instance variable
    private double cost;

    //constructor with parameter
    public Carpet(double cost) {
        //use ternary operator
        this.cost = cost < 0 ? 0 : cost;//the cost parameter is less than 0 it needs to set the cost field value to 0.
    }
    // Instance method

    public double getCost() {
        return cost;
    }
}