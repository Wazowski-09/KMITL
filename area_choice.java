import java.util.Scanner;
public class area_choice {
    public static void main(String[] args) {
        System.out.println("Menu => ");
        System.out.println("1.Circle Area");
        System.out.println("2.Circumference");
        System.out.println("3.Rectangle Area");
        Scanner input = new Scanner(System.in);
        System.out.print("Choice => ");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.print("Radius => ");
            double radius = input.nextDouble();
            double areaCir = Math.PI * Math.pow(radius,2);
            System.out.println("Circle Area => " + areaCir);
        }
        else if(choice == 2){
            System.out.print("Radius => ");
            double radius = input.nextDouble();
            double Circum = 2* Math.PI * radius;
            System.out.println("Circumference => " + Circum);
        }
        else if(choice == 3){
            System.out.print("Width => ");
            double width = input.nextDouble();
            System.out.print("Height => ");
            double height = input.nextDouble();
            System.out.print("Ractangel Area = " + (width * height));
        }
    }
}