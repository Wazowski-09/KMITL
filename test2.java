import java.util.*;

public class test2 {
   public static void main(String[] args) {
    int studentcode[]= new int[1000]; // for student id purpose
    int studentscore[][] = new int[1000][100];
    int scoredetect[][] = new int[1000][5];
    int choice[] = new int[5];
    int temporary = 57050001;
    //studentcode
    for (int i=0;i<1000;i++) {
    temporary = temporary + i;
    studentcode[i] = temporary;
    //System.out.println(studentcode[i]); // for checking purpose
    }
    //studentscore
    Random randomscore = new Random(233);
    int temporary2 = 0;
    for (int i=0;i<1000;i++) {
        for (int j=0;j<100;j++) {
            temporary2 = randomscore.nextInt(5)+1;
            studentscore[i][j] = temporary2;
            //System.out println(studentscore[i][j]); // for checking purpose
        }
    }
    //scoredetect
    for(int i=0;i<1000;i++) {
        for(int j=0;j<100;j++) {
            if (studentscore[i][j] == 1)
                scoredetect[i][0]++; //add
            if (studentscore[i][j] == 2)
                scoredetect[i] [1]++; //add
            if (studentscore[i][j] == 3)
                scoredetect[i][2]++; //add
            if (studentscore[i][j] == 4)
                scoredetect[i][3]++; //add
            if (studentscore[i][j] == 5)
                scoredetect[i][4]++; //add
        }
    }
    // output
    for(int i=0;i<1000;i++)
       System.out.println("Student ID : "+studentcode[i]+" | Choice 1 : "+scoredetect[i][0]+" | Choice 2 : "+scoredetect[i][1]+" | Choice 3 : "+scoredetect[i][2]+" | Choice 4 :"+scoredetect[i][3]+" | Choice 5 : "+scoredetect[i][4]);
       // for maximum of choice's picking
       choice[0] = 0;
       for(int i=0;i<1000;i++)
           choice[0] = choice[0] + scoredetect[i][0];
           choice[1] = 0;
       for(int i=0;i<1000;i++)
           choice[1] = choice[1] + scoredetect[i][1];
           choice[2] = 0;
       for(int i=0;i<1000;i++)
           choice[2] = choice[2] + scoredetect[i][2];
           choice[3] = 0;
       for(int i=0;i<1000;i++)
           choice[3] = choice[3] + scoredetect[i][3];
           choice[4] = 0;
       for(int i=0;i<1000;i++)
           choice[4] = choice[4] + scoredetect[i][4];
    int detectorreceiver = maximumdetector(choice);
    if(detectorreceiver == 0)
           System.out.println("The most picked choice is choice 1 ,picked "+choice[0]+ " choices.");
    if(detectorreceiver == 1)
           System.out.println("The most picked choice is choice 2 ,picked "+choice[1]+ " choices.");
    if(detectorreceiver == 2)
           System.out.println("The most picked choice is choice 3 ,picked "+choice[2]+ " choices.");
    if(detectorreceiver == 3)
           System.out.println("The most picked choice is choice 4 ,picked "+choice[3]+ " choices.");
    if(detectorreceiver == 4)
           System.out.println("The most picked choice is choice 5 ,picked "+choice[4]+ " choices.");
   }
   public static int maximumdetector(int[] choice) {
       int maximum = choice[0];
       for(int i=1;i<choice. length; i++) {
           if(choice[i] > maximum)
           {
           maximum = choice[i];
           }
       }
       for (int i=0;i<choice.length; i++) {
           if (maximum == choice[0]){
           maximum = 0;}
           if (maximum == choice[1] ){
           maximum = 1;}
           if (maximum == choice[2]){
           maximum = 2;}
           if (maximum == choice[3]){
           maximum = 3;}
           if (maximum == choice[4]){
           maximum = 4;}
       }
       return maximum;
   }
}
