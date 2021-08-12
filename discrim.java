import java.util.Scanner;
public class discrim{ 
    public static double valueDis(double a,double b,double c){
        double x = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
        return x;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Quadratic Equation ax^2 + bx + c");
    System.out.print("a = ");
    double a = input.nextDouble();
    System.out.print("b = ");
    double b = input.nextDouble();
    System.out.print("c = ");
    double c = input.nextDouble();
    System.out.println("x = " + valueDis(a,b,c));
}
}