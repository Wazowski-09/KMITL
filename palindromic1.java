import java.util.*;
public class palindromic1 {
    public static void main(String[] args) {
        Scanner mike = new Scanner(System.in);
        System.out.print("number : ");
        int n = mike.nextInt();
        if((palin(n)) == n){
            System.out.println((palin(n)));
            System.out.println("This number is palindromic");
        }
        else{
            System.out.println((palin(n)));
            System.out.println("This number is not palindromic");
        }

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