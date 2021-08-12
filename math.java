public class math {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            // math.fact(i);
            // math.power(i,2);
            math.all(i,2);
        }
    }
    // public static void power(int x ,int n){
    //     double sum = 1;
    //     for(int i = 1;i <= n; i++)
    //         sum *= x;
    //     //return sum;
    //     System.out.println(sum);
    // }
    // public static void fact(int x){
    //     double sum = 1;
    //     for(int i = 1; i <= x; i++)
    //         sum *= i;
    //     //return sum;
    //     System.out.println(sum);
    // }
    public static void all(int x ,int n){
        double sum = 1;
        double sum1 = 1;
        for(int i = 1; i <= x; i++)
            sum *= i;

        for(int a = 1;a <= n; a++)
            sum1 *= x;
        
        System.out.println(sum/sum1);
        double sum2 = (sum2 + (sum/sum1));
        System.out.println(sum2);
    }
}