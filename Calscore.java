import java.util.*;
public class Calscore {
    
    static void Getscore(int []score){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i< score.length;i++){
            System.out.printf("%s %d %s","score",i+1," = ");
            score[i] = input.nextInt();
        }
    }
    public static void Calavg(int []score){
        double sum = 0; double mean;
        for(int i = 0;i < score.length;i++){
            sum += score[i];
        }
        mean = sum / score.length;
        System.out.println("mean => " + mean);     
    }
    public static void main(String[] args) {
        int []score = new int[5];    
        //int []score = {11,20,15,5,25};
        Getscore(score);
        Calavg(score);
    }
}
