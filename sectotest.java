import java.util.*;
import java.lang.Math;

public class sectotest{
    public static void main(String[] args) {
        int distant[] = {0, 2, 74, 219, 4, 21, 49, 17, 123};
        int mDay[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dt = 20201130;
        int [] dmy = date(dt);
        double day = day(distant);
        int day1 = (int)day;
        int [] ansumday = sumday(dmy[0],dmy[1],dmy[2],day1);
        
        System.out.print("เริ่มเดินวันที่ : ");
        for(int i =0; i<dmy.length;i++){
        System.out.print(dmy[i]+" ");
        }
        System.out.println("");
        System.out.print("เดินทั้งหมด : ");
        System.out.println(day1);
        System.out.print("เสร็จสิ้นภารกิจวันที่ : ");
        for(int i =0; i<ansumday.length;i++){
            System.out.print(ansumday[i]+" ");
        }
        System.out.println("");


    }
    public static double day(int[] distant) {
        double sum = 0;
        for(int i = 1; i<distant.length;i++ ){
            double a = distant[i] / 10.0;
            double b = Math.ceil(a);
            sum = b+sum;
            sum = sum + 3;
        }
        return sum;
    }
    public static int[] date(int dt) {
    int d = (dt%100);
    int m = (dt/100)%2020;
    int y=dt/10000;
    int [] dmy = new int[3];
    dmy[0] = d;
    dmy[1] = m;
    dmy[2] = y;
    return dmy;
    }
    public static int[] sumday (int d,int m,int y,int t) {
        int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        while (sum < t) {
         d++ ; sum++;
         if(d > month[m]) {
             d=1; m++;
            }
           if(m==13) {
               m=1;y++;
            }
             if (y%4==0) month[2] = 29;
             month[2] = 28;
        }//while
        int ans [] = new int [3];
        ans[0]=d;
        ans[1]=m;
        ans[2]=y;
        return ans;
       }
}