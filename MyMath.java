import java.util.*;

public class MyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x => ");
        double x = sc.nextDouble();
        System.out.print("enter n => ");
        int n = sc.nextInt();
        System.out.println(power(x,n));
        System.out.println(MyMath.fact(x));
    }
    public static double power(double x ,int n){
        double sum = 1;
        for(int i = 1;i <= n; i++)
            sum *= x;
        return sum;
    }
    public static double fact(double x){
        double sum = 1;
        for(int i = 1; i <= x; i++)
            sum *= i;
        return sum;
    }
}