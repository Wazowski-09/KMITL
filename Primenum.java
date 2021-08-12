import java.util.*;
public class Primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number => ");
        int num = sc.nextInt();


        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && num != i) {
                System.out.println("Not prime number " + num);
                return;
            }
                    }
        if (num != 1) {
            System.out.println("prime number " + num);
        }
        else {
            System.out.println("Not prime number " + num);
        }
    }
}