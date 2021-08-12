import java.util.Scanner;

class Tri 
{
 public static void main(String[] args) 
  {
    int i, j, n;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    for (i = 1; i <= n; i++) {
      for (j = i; j < n; j++)
        System.out.print(" ");
      for (j = 1; j <= i; j++)
        System.out.print(j % 10);
      for (j = i - 1; j >= 1; j--)
        System.out.print(j % 10);
        System.out.print("\n");
    }
  }
}