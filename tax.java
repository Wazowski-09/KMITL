import java.util.Scanner;
public class tax {
    
   public static double calTax1(double income){
    double tax; double net;    
    tax = income * 0.4;
    if(tax < 60000){
        net = income - tax;
    }else
        net = income - 60000;     
    return net;
    }
   
    public static double calTax2(double net){
        double tax;
    if(net  < 50000){
        tax = 0;
    }else if(net <= 100000){
        tax = (net - 50000) * .05;
    }else if(net <= 300000){
        tax = 2500 + (net - 100000) * .1;
    }else if(net <= 1000000){
        tax = 22500 + (net - 300000) * .15;
    }else
        tax = 127500 + (net - 1000000) * .20;
    return tax;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary = "); 
        double salary = input.nextDouble();
        double income = salary * 12;
        System.out.println("income = "+ income);
        System.out.println("net = " + calTax1(income));
        System.out.println("tax = " + calTax2(calTax1(income)));
    }
}