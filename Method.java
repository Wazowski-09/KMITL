import java.util.*;
public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius => ");
        double r = sc.nextDouble();
        double a = Square(r);
        double b = Circle(r);

        // System.out.println("Circle = " + 3.14f * (radius * radius));
        System.out.println("Area => " + (a-b));
    }
    public static double Square(double r) {
        double area = (r*2)*(r*2);
        return area;
    }
    public static double Circle(double r) {
        double area = 3.14168*r*r;
        return area;
    }
}