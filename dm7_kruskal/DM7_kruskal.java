package dm7_kruskal;

//https://www.geeksforgeeks.org/kruskals-algorithm-simple-implementation-for-adjacency-matrix/

import java.util.*;

class DM7_kruskal {

    public static void main(String[] args) {

        // int [][] Distance = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
        // {0, 0, 8, 0, 0, 0, 0, 11, 0},
        // {0, 0, 0, 7, 0, 4, 0, 0, 2},
        // {0, 0, 0, 0, 9, 14, 0, 0, 0},
        // {0, 0, 0, 0, 0, 10, 0, 0, 0},
        // {0, 0, 0, 0, 0, 0, 2, 0, 0},
        // {0, 0, 0, 0, 0, 0, 0, 1, 6},
        // {0, 0, 0, 0, 0, 0, 0, 0, 7},
        // {0, 0, 0, 0, 0, 0, 0, 0, 0}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dot:");
        int dot = sc.nextInt();
        int[][] array = new int[dot][dot];

        calkruskal x = new calkruskal();
        x.input(dot, array);
        x.setv(dot);
        x.kruskalMST(array);
    }

}
// Minneapolis = 1
// Milwaukee = 2
// Chicago = 3
// Detroit = 4
// Cincinnati = 5
// Louisville = 6
// St.Louis = 7
// Nashville = 8
