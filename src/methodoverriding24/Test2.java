package methodoverriding24;
//Java Program to demonstrate the real scenario of Java Method Overriding
//where three classes are overriding the method of a parent class
public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate Of Interest : " + s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest : " + i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest : " + a.getRateOfInterest());
    }
}//Run the program