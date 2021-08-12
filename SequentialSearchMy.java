import java.util.Scanner;
public class SequentialSearchMy {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter key : => ");
          String key = sc.nextLine();
          String [] name = {"","beam","jum","tonkla","mike","game","jing","tae"};
          System.out.println(key);
          search(name,key);
          if(search(name,key) == -1){
               System.out.println("NOT Found");
          }
          System.out.println(search(name,key));
     }

    public static int search(String [] name1, String key1) {
     for(int i = 0; i < name1.length; i++) {
      if(name1[i] .equals(key1)) {
       return i;
      }
     }
     return -1;
    }
}
