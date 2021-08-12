public class SelectionSortMy {
  public static void main(String[] args) {
      //int [] a = {9,7,5,3,1,8,6,4,2};
      int [] a = {1,2,3,4,5,6,7,9,8};
      System.out.print("Before  ");
      for(int i = 0;i < a.length;i++){  
        System.out.print(a[i]+" ");  
      }  
      System.out.println();
      System.out.print("After  ");
      sort(a);
      for(int k = 0;k < a.length;k++){  
        System.out.print(a[k]+" ");  
      }

  }  
  public static void sort(int [] a1){
      for(int i = 0;i < a1.length;i++){
          for(int j = i + 1;j < a1.length;j++){
              if(a1[j] < a1[i]){
                  int smallnum = a1[j];
                  a1[j] = a1[i];
                  a1[i] = smallnum;
              }
          }
      }
  }
}
