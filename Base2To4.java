import java.util.*;
public class Base2To4 {
    static int Base2To10(int x){
        int i = 0;
        int n; int ans = 0;
        while(x != 0){
            n = x % 10;
            ans += n * (int)Math.pow(2,i);
            x /= 10;
            i++;
        }
        return ans;
    }
    static int Base10To4(int x){
    int i = 0; int ans = 0;
    int n;
    while(x != 0){
        n = x % 4;
        ans += n * (int)Math.pow(10,i);
        x /= 4;
        i++;
    }
    return ans;
    }
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        int x = 1001;
        System.out.println(x + " base 2 to base 10 is " +Base2To10(x));
        System.out.println(Base2To10(x) + " base 10 to base 4 is " + Base10To4(Base2To10(x)));
    }
}
