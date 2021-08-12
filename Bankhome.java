import java.util.Scanner;

class Bankhome 
{
 public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Principal : ");
    double prin = scan.nextInt();
    System.out.print("Enter Payment per month : ");
    double payM = scan.nextInt();
    double inter = 0;
    double pay;
    double net = prin;
    double rate = 4;
    int month;
    System.out.println("month   Rate/year    principal       interest       Pay for Principal         net");
      for(month =1;net>0;month++){
        prin = net;
        inter = prin*rate/1200;
        pay = payM-inter;
        net = prin-pay;
        System.out.printf("%3d      %5.2f    %12.2f   %12.2f       %12.2f        %12.2f",month,rate,prin,inter,pay,net);
        System.out.println();
        if(month%12 == 0 && month <= 36)
        rate++;
      }
    System.out.println("You must pay " + ( month-1 ) + " terms");
    System.out.printf("Last Term = %8.2f Bath ", prin + inter);
  }
}