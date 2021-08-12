import java.util.Scanner;

class incometax{
    public static void main(String[]args){
      double salary,income,net,tax;
      Scanner yo = new Scanner(System.in);
      System.out.print("Enter Salary : ");
      salary = yo.nextDouble();

      income = salary*12;
      if(income*0.4 < 60000){
          net = income*0.6;
      }
      else {
          net = income - 60000;
      }

      if(net <= 50000){
          tax = 0;
      }
      else if(net <= 100000){
        tax = (net-50000)*0.05;
      }
      else if(net <= 300000){
        tax = 2500 + (net-100000)*0.1;
      }
      else if(net <= 1000000){
        tax = 22500 + (net-300000)*0.15;
      }
      else{
        tax = 12750 + (net-1000000)*0.2;
      }
    System.out.println("salary ="+salary);
    System.out.println("income ="+income);
    System.out.println("net ="+net);
    System.out.println("tax ="+tax);
    }
}