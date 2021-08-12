import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A => ");
        double a = sc.nextDouble();
        System.out.print("Enter B => ");
        double b = sc.nextDouble();

        double x = a;
        double y = b;

        while (y != 0) {
            double p = y;
            y = x % y;
            x = p;
        }

        System.out.println("GCD = " + x);
    }
}