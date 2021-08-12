import java.util.Scanner;

public class Gcd {
 public static void main(String [] args)
 {
  int a, b, gcd = 1, lcm;
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Please input first number : ");
  a = sc.nextInt();  
  System.out.print("Please input second number : ");
  b = sc.nextInt();

  int x = Math.abs(a);
  int y = Math.abs(b);
     while(y != 0)
     {
         int t = y;
         y = x%y;
         x = t;
     }
     gcd = x;
     lcm = (a*b) / gcd;

     System.out.println("\nThe greatest common divisor is " + Math.abs(gcd));
     System.out.println("The least common multiple is " + Math.abs(lcm));
 }
}