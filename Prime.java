import java.util.Scanner;

public class Prime {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input number to check Prime Number : ");
       int n = scanner.nextInt();
       int m = 0,flag = 0;
       m = n/2;
       for(int i = 2; i <= m; i++){
           if(n%i == 0){
               System.out.println( n + " is not a prime number.");
               flag = 1;
               break;
            }
        }
        if(flag == 0) {
            System.out.println( n + " is a prime number.");
        }
    }
}