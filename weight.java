import java.util.*;
class weight 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double percent = 10;
        double reduce = weight/100;
        double total;
        // totalreduce = total+reduce;
        System.out.println("Weight \t % \t reduce \t now \t total_reduce");
        switch (weight){
            case 100 : System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 90 : percent--; double now = reduce*percent;
                        System.out.println(weight + "\t" + percent + "\t" + now);
            case 80 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 70 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 60 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 50 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 40 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);
            case 30 : percent--; 
                        System.out.println(weight + "\t" + percent + "\t" + reduce);

        }
    }
}