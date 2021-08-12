import java.util.Scanner;
public class candy {
    public static void candy(int pieces) {
    int pieces20 = pieces / 20;
    int pieces10 = pieces % 20 / 10;
    int pieces5 = pieces % 20 % 10 /5;
    int pieces1 = pieces % 20 % 10 %5 /1;
    int total = (pieces20*25) + (pieces10*15) + (pieces5*10) + (pieces1*3);
    System.out.println("pieces 20 = " + pieces20 + " price = " + pieces20*25);
    System.out.println("pieces 10 = " + pieces10 + " price = " + pieces10*15);
    System.out.println("pieces 5  = " + pieces5 + " price = " + pieces5*10);
    System.out.println("pieces 1  = " + pieces1 + " price = " + pieces1*3);
    System.out.println("Total  = " + total);   

    Scanner input1 = new Scanner(System.in);
    System.out.print("money =>");
    int money = input1.nextInt();

    int m = money - total;
    System.out.println(m);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("pieces =>");
    int pieces = input.nextInt();
    candy(pieces);    
    }
    // public static void main1(String[] args) {
    // Scanner input1 = new Scanner(System.in);
    // System.out.print("money =>");
    // int money = input1.nextInt();
    // price(money);    
    // }
}