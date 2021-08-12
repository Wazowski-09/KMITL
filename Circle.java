import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius => ");
        double radius = sc.nextDouble();

        System.out.println("Circle = " + 3.14f * (radius * radius));
    }
}