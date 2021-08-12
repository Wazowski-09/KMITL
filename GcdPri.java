import java.util.*;
public class GcdPri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one => ");
        int x = sc.nextInt();
        System.out.print("Enter two => ");
        int y = sc.nextInt();
        int gcd = gcd(x, y);
        System.out.println("GCD = " + gcd(x, y));
        System.out.println("LCD = " + lcm(x,y,gcd));
        int n = gcd(x, y);
        if(prime(n))System.out.println(n +" =>"+ " is prime ");
        else System.out.println(n +" =>"+ " Not prime");
    }
    public static int gcd(int x,int y) {
        int p = y;
        for (;y != 0;) {
            y = x % y;
            x = p;
        }System.out.println(x);
        return x;
    }
    public static int lcm(int x,int y,int gcd) {
        int lcd = (x*y)/gcd;
        return lcd;
    }
    public static boolean prime(int n) {
        int i;boolean ck = true;
        if (n==1) ck = false;
        for (i=2;i<n;i++)
            if(n%i ==0){
                ck = false;
                break;
            }
        return ck;
    }
}