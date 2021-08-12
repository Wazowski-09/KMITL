import java.util.Scanner;
public class ATM{
    public static int bank1(int money){
        int bank_1000 = money / 1000;
        return bank_1000;
    }
    public static int bank2(int money){
        int bank_500 = money % 1000 / 500;
        return bank_500;
    }     
    public static int bank3(int money){
        int bank_100 = money % 1000 % 500 / 100;        
        return bank_100;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Money => ");
        int money = input.nextInt();
        if(money % 100 != 0)
            System.out.print("***ERROR***");
        else{
        System.out.println("bank 1000 = " + bank1(money));
        System.out.println("bank 500 = " + bank2(money));
        System.out.println("bank 100 = " + bank3(money));
        }
    }
}