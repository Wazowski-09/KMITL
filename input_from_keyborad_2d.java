import java.util.*;

public class input_from_keyborad_2d {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 2;
    
        Scanner sc = new Scanner(System.in);
        String[][] array = new String[rows][cols];
    
        for (int row = 0; row < rows; row++) {
            System.out.println("Enter name:");
            array[row][0] = sc.nextLine();
    
            System.out.println("Enter the address:");
            array[row][1] = sc.nextLine();
        }
    
        // Print out array
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(array[row][col] + ", ");
            }
            System.out.print(";");
        }
    }
}
