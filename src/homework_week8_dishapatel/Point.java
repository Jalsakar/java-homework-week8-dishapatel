package homework_week8_dishapatel;

/**
 * Represent a point in 2D space.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * NOTE: Use Math.sqrt to calculate the square root √.
 */

public class Point {
    private int x, y;//Private Instance variable

    //No-Arguments Constructor(Without parameters)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //Parameterised Constructor with parameters by creating Point object
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Instance methods
    //get-methods to get the x and y value
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    ////set-methods to set new x and y values for point

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Calculate the distance from this point to the origin (0,0) using the Pythagorean theorem
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    //Calculate the distance between this point and the specified point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);//Calculate the distance between point and another point(x,y)
    }

    //Main method with Test code
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("Distance(0,0) = " + first.distance());
        System.out.println("Distance(second) = " + first.distance(second));
        System.out.println("Distance(2,2) = " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("Distance() = " + point.distance());
    }
}//Run the program