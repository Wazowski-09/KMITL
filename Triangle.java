import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter High => ");
        double high = sc.nextDouble();
        System.out.print("Enter Base => ");
        double base = sc.nextDouble();

        System.out.println("Triangle = " + 0.5 * base * high);
    }
}