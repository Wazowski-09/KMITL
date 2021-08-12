import java.util.Scanner;

class Mid 
{
 public static void main(String[] args) 
  {
    int [] data ={2,3,1,0,5,8,6,7};
    for (int i = 0; i < data.length; i++){
        int min = data[i];
        int minIndex = i;
        // System.out.print(min);
        for (int j = i; j < data.length; j++){
            if(data[j] < min){
                min = data[j];
                minIndex = j;
                System.out.print("min => " + min);
                System.out.println(" minIndex => " + minIndex);
                // System.out.println("XD");
            }
        }
    }
  }
}