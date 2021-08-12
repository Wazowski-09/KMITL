//import java.util.*;
public class Mymath3 {
    public static int Reverse(int n){ // reverse of a number!!!
        int ans = 0; int digit;
        while(n != 0){
        digit = n % 10;
        ans = ans * 10 + digit;
        n /= 10;
        }
        return ans;
    }
    public static void Palindrome(int n, int revse){ // palindrome or NOT?
        if(n == revse){
            System.out.println(n + " is Palindrome.");
        }else {
            System.out.println(n + " is not Palindrome.");
        }
    } 
    public static void PrimeNum(int n){ // prime number or NOT?
        boolean check = true;
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.printf("%d%s\n",n," is the prime number.");
        }else{
            System.out.printf("%d%s\n",n," is Not the prime number.");
        }
    }
    public static void PerfectNumber(int n){ // perfect number or NOT?
        int ans = 0;
        for(int i = 1;i < n;i++){
            if(n % i == 0){
                ans += i;
            }
        }
        if(ans == n){
            System.out.println(n + " is a Pefect Number");
        }else if(ans < n){
            System.out.println(n + " is a Deficient Number");
        }else 
            System.out.println(n + " is an Abundant Number");
    }
    public static int gcd(int q ,int p){ // find gcd 
        int check = 0;
        int min = p < q ? p : q; // if(p < q) min = p else min = q;
            while(check != 1){
                check = p % min == 0 && q % min == 0 ? 1 : min--; 
        }
        return min;
    }
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        int n = 859;
        System.out.println("reverse of " + n + " is " + Reverse(n));//reverse
        Palindrome(n,Reverse(n)); //palindrome or not?
        PrimeNum(n); //prime number or not?
        PerfectNumber(n); //perfect number or not?;
        int q = 4; int p = 10;
        // find the greatest common divisor!!!
        System.out.printf("%s%d %d%s%d\n","GCD of ",q,p," is ",gcd(q,p)); 
        // q * p = (gcd. of q * p)*(lcm. of q * p) ==> lcm. = q * p / gcd.
        System.out.printf("%s%d %d%s%d\n","LCM of ",q,p," is ",(q*p) / gcd(q,p));
    }
}