import java.util.*;
public class palindromic {
    public static void main(String[] args) {
        Scanner mike = new Scanner(System.in);
        System.out.print("number : ");
        int n = mike.nextInt();
        System.out.println(palin(n));

    }
    public static int palin(int n){
        int sum = 0;
        int m1 = 0;
        for(int i = 1;n != 0;i++){
            m1 = n % 10;
            sum = (sum*10) + m1;
            n /= 10;
        }
        return sum;
    }
}