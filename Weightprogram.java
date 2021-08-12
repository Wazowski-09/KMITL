import java.util.*;
public class Weightprogram { 
    public static void calWeight(double w){
        double reduce , reducing = 0;
        for(int i=10;i>=3;i--){
            reduce = w * i/100;
            w -= reduce;
            reducing += w * (100 - i/100);
            System.out.println("reduce = " + reduce);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight = ");
        double weight = input.nextDouble();
        calWeight(weight);           
    }    
    }
    
