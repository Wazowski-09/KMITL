import java.util.Scanner;

class final1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n = 5 * 10 + n;
        demo(n);
    }

    public static void demo(int n) {
        int num;
        if (n <= 2){
            System.out.println(n);
        }
        else {
            num = n % 3;
            n = n / 3;
            demo(n);
            System.out.println(num + "   " + n);
        }
        System.out.println(n);
    }
}
