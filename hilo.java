import java.util.*;
public class hilo {
    public static void main(String[] args) {
        String real;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter H or L => ");
        String predict = input.nextLine();
        Random rand = new Random();
        int num1 = rand.nextInt(6) + 1;
        int num2 = rand.nextInt(6) + 1;
        int num3 = rand.nextInt(6) + 1;
        int total = num1 + num2 + num3;
        System.out.println("Total = " + total);
        if(total > 10){
            real = "H";
        }
        else{
            real = "L";
        }
        if(predict.equals(real)){
            System.out.print("You win");
        }else{
            System.out.print("You loss");
        }
    }
}