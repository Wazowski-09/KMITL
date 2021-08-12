import java.util.Scanner;
public class practice {
    public static double calPrice(double total_price){ 
        if(total_price > 300)
            return total_price * .97 * 1.07;
        else
            return total_price * 1.07;
    }
    public static double calMoney(double money,double total_price){
        return money - total_price;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the price of shirt = ");
       double price_shirt = input.nextDouble();
       System.out.print("Enter the number of shirt = ");
       int num_shirt = input.nextInt();
       double total_price = price_shirt * num_shirt;
       System.out.printf("total price = %.2f\n" ,calPrice(total_price));
       System.out.print("Enter Money = ");
       double money = input.nextDouble();
       System.out.printf("Your Change = %.2f\n" ,calMoney(money,calPrice(total_price)));   
    }
}
