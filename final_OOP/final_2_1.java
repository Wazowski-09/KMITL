import java.util.*;

public class final_2_1 {
    public static void main(String[] args) {
        int[] a = { -11, 8, 15, 20, 30, 40, 50 };
        int[] b = { -2, 5, 7, 25, 45, 70, 90, 100 };
        ArrayList<Integer> c = new ArrayList<Integer>();
        Sort s = new Sort();
        s.sortArray(c, a, b);
        s.displaySort(c);
    }
}

class Sort {
    public void sortArray(ArrayList<Integer> cArray, int[] aArray, int[] bArray) {
        for (int i = 0; i < aArray.length; i++) {
            cArray.add(aArray[i]);
        }
        for (int i = 0; i < bArray.length; i++) {
            cArray.add(bArray[i]);
        }
        // int i;
        // int j;
        // for (i = 0; i < cArray.size(); i++) {
        //     int x = cArray.get(i);
        //     j = i - 1;
        //     while (j >= 0 && x < cArray.get(j)) {
        //         int c1 = cArray.get(j + 1);
        //         c1 = cArray.get(j);
        //         j = j - 1;
        //         int c2 = cArray.get(j + 1);
        //         c2 = x;
        //     }
        // }
        int temp;
        for (int i = 0; i < cArray.size(); i++) // To take one element
        {
            for (int j = i + 1; j < cArray.size(); j++) // compare the element that have been taken in a[i]
            {
                if (cArray.get(i) > cArray.get(j)) // To Swap if element compared is greater than other element
                {
                    int c1 = cArray.get(i);
                    int c2 = cArray.get(j);
                    temp = c1;
                    c1 = c2;
                    c2 = temp;
                }
            }
        }
    }

    public void displaySort(ArrayList<Integer> cArray) {
        for (int i = 0; i < cArray.size(); i++) {
            System.out.print(cArray.get(i) + " ");
        }
    }
}