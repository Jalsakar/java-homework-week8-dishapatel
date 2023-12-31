package homework_week8_dishapatel;

/**
 * Write a class with the name SimpleCalculator.
 * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 * ● Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters,
 * it needs to return the result of adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters,
 * it needs to return the result of subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters,
 * it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters,
 * it needs to return the result of dividing the field values of firstNumber by the secondNumber.
 * In case the value of secondNumber is 0 then return 0.
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 */
public class SimpleCalculator {
    // Instance variables
    private double firstNumber, secondNumber;

    //getter and setter instance methods
    //Instance methods to set the value of the both fields
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    // Instance method to set the value of the both fields
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Method to get the arithmetic result of the both number
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return secondNumber / firstNumber;
    }
    //Main method

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
    }
}//Run the program