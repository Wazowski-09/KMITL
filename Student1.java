import java.util.*;
public class Student1 {
    public static void main(String[] args) {
    String []idStudent = {"nut","nick","nook","nope","noob"};
    //String []idStudent = new String[5];
    double []score = {50,12,30,65,45};
    //System.out.println("Before");
    System.out.println(Arrays.toString(idStudent));
    System.out.println(Arrays.toString(score));
    scoreSort(idStudent,score);
    //System.out.println("----After----");
    System.out.println(Arrays.toString(idStudent));
    System.out.println(Arrays.toString(score));

}
    public static void scoreSort(String []id,double []score){
        double temp1; String temp2;
        for(int i = 0; i < score.length;i++){
            for(int j = 0;j < score.length;j++){
                  if(score[i] < score[j]){
                      temp1 = score[j];
                      score[j] = score[i];
                      score[i] = temp1;
                      temp2 = id[j];
                      id[j] = id[i];
                      id[i] = temp2;
                  }
            }
    }
}
}