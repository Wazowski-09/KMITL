import java.util.*;
public class gradestudent {
    public static double calAvg(double m, double f){
        return (m + f)/2;
    }
    public static char grade(double calAvg){
        if(calAvg >= 80){
            return 'A';
        }else if(calAvg >= 70){
            return 'B';
        }else if(calAvg >= 60){
            return 'C';
        }else if(calAvg >= 50){
            return 'D';
        }else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double midScore = 50,finalScore = 70;
        for(int i = 1;i <= 10;i++){
        System.out.print("Enter name = ");
        String name = input.next();
        System.out.print("Enter Mid term Score = ");
        double midScore = input.nextDouble();
        System.out.print("Enter Final term Score = ");
        double finalScore = input.nextDouble();
        System.out.printf("name-%d = %s\n" ,i,name);
        System.out.printf("Average-%d = %.2f\n", i,calAvg(midScore,finalScore));
        System.out.printf("grade-%d = %c\n", i,grade(calAvg(midScore,finalScore)));
        }
}   
}