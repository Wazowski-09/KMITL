import java.util.*;

public class input_2d_test {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int INF = Integer.MAX_VALUE;
            System.out.print("Enter dot:");
            int dot = sc.nextInt();
            //System.out.println();

            //System.out.println("ready to distant:");
            int[][] array = new int [dot][dot];
        
            // for (int row = 0; row < dot; row++) {
            //     System.out.println("Enter name:");
            //     array[row][0] = sc.nextLine();
        
            //     System.out.println("Enter the address:");
            //     array[row][1] = sc.nextLine();
            // }
            int x =1;
            int n = 1;
            for (int row = 0; row < dot; row++) {
                for (int col = x; col < dot; col++) {
                    System.out.print("Enter distant:"+(n)+"=>"+(n+1));
                    array[row][col] = sc.nextInt();
                    //System.out.println();
                    n = n+1;
                }
                x = x+1;
            }
            // for (int row = 0; row < dot; row++) {
            //     for (int col = 0; col < dot; col++) {
            //         if(array[row][col] == 0){
            //             array[row][col] = INF;
            //         }
            //     }
            // }
            // Print out array
            for (int row = 0; row < dot; row++) {
                for (int col = 0; col < dot; col++) {
                    System.out.print(array[row][col] + ", ");
                }
                System.out.println(";");
            }
        }
    }