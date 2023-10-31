package abstractexample21;
//Create the main class name TestAbstraction and inside create the main method as below.
public class TestAbstraction {
    //In real scenario, method is called by programmer or user
    public static void main(String[] args) {
        Shape s = new Circle();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}//Run the program