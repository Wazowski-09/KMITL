import java.util.*;
public class Mymath2 {
    public static double seq(int n){
        double ans_fact = 1; double ans_pow = 1; double sumOdd = 0;
        double sumEven = 0;
        for(int i = 1;i <= n;i++){
            if(i % 2 != 0){
                ans_fact *= i;
                ans_pow = Math.pow(i,2);
                sumOdd += (ans_fact / ans_pow);
            }else{
                ans_fact *= i;
                ans_pow = Math.pow(i,2);
                sumEven += (ans_fact / ans_pow);
            }
        }
        return sumOdd - sumEven;
    } 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter n => ");
    int n = input.nextInt();
    System.out.print("Answer = "+ seq(n));
    }
}