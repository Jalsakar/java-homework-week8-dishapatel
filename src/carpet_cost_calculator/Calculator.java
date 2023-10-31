package carpet_cost_calculator;

public class Calculator {
    //Two private instance variables
    private Floor floor;
    private Carpet carpet;

    //Constructor with parameters
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //Instance methods
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();//return the calculated total cost to cover the floor with a carpet.
    }
}