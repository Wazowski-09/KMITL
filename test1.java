import java.util.*;

public class test1 {
    public static void main(String[] args) {

        int jump_A = 0;
        int jump_B = 360;
        int count = 0;
        boolean work = true;

        int mofy[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y = 2563-543;
        int m = 10;
        int d = 28;

        while(work) {
            count++;
            jump_A +=  2;
            jump_B -=  5;

            if(jump_A == 360)jump_A = 0;
            if(jump_B == 0)jump_B = 360;
            if(jump_A == 0 && jump_B == 360) work = false;
            if(jump_A == jump_B) work = false;

        }

        for(int i = 1; i <= count; i++ ){
            if((y%4 == 0) && ((y%100 != 0 || y%400==0))){
                mofy[2]=29;
            }
            d++;
            if(d>mofy[m]){
                d=1; m++;
            }
            if(m>12){
                m=1; y++;
            }
        }
        System.out.println("Num of DAY : "+count+"\nJUMP>> "+jump_A+ "\nDAY : "+d+ "  Month : "+m+ "  Year : "+(y+543));

    }
}