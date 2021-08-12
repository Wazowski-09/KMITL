package dm7_shortesrt_path;

import java.util.*;
import java.lang.*;
import java.io.*;

public class cal_shortest_path {
    public int V;
    public int INF = Integer.MAX_VALUE;
    public Scanner sc = new Scanner(System.in);

    public void setv(int dot) {
        this.V = dot;
    }

    public int[][] input(int dot, int array[][]) {
        int x = 1;
        int n = 2;
        for (int row = 0; row < dot; row++) {
            for (int col = x; col < dot; col++) {
                System.out.print("Enter distant " + (x) + "=>" + (n) + " : ");
                array[row][col] = sc.nextInt();
                array[col][row] = array[row][col];
                n = n + 1;
            }
            x = x + 1;
            n = x + 1;
        }
        // for (int row = 0; row < dot; row++) {
        // for (int col = 0; col < dot; col++) {
        // if (array[row][col] == 0) {
        // array[row][col] = INF;
        // }
        // }
        // }
        // for (int row = 0; row < dot; row++) {
        // for (int col = 0; col < dot; col++) {
        // System.out.print(array[row][col] + ", ");
        // }
        // System.out.println(";");
        // }
        return array;
    }

    int minDistance(int dist[], Boolean sptSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    // void printSolution(int dist[], int src) {
    //     System.out.println("Vertex \t\t Distance");
    //     for (int i = 0; i < V; i++) {
    //         System.out.println((src + 1) + " => " +  (i + 1) +" \t\t "+  dist[i]);
    //     }
    // }

    void findtarget(int dist[], int src, int target) {
        System.out.println("\nyour location : "+(src + 1) + " => " +"destination : "+ (target + 1) +"\ndistance : " + dist[target]);
    }

    void dijkstra(int array[][], int src, int target) {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
        // int[][] check = new int

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && array[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + array[u][v] < dist[v]) {
                    dist[v] = dist[u] + array[u][v];
                }
            }
        }

        //printSolution(dist, src);
        findtarget(dist, src, target);
    }

}
