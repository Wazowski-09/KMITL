package dm7_shortesrt_path;

//https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

import java.util.*;

public class DM7_shortest_path {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dot:");
        int dot = sc.nextInt();
        int[][] array = new int[dot][dot];
        System.out.print("Where are you? :");
        int go = sc.nextInt();
        int go1 = go - 1;
        System.out.print("Where are you going? :");
        int target = sc.nextInt();
        int target1 = target - 1;
        cal_shortest_path s = new cal_shortest_path();
        s.input(dot, array);
        s.setv(dot);
        s.dijkstra(array, go1, target1);
    }
}

// a = 1
// b = 2
// c = 3
// d = 4
// e = 5
// z = 6
