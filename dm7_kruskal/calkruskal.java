package dm7_kruskal;

import java.util.*;

class calkruskal {
	public Scanner sc = new Scanner(System.in);
	public int V;
	public int INF = Integer.MAX_VALUE;
	public int[] parent = new int[V];

	public void setv(int dot) {
		this.V = dot;
		setparent(V);
	}

	public void setparent(int parent) {
		this.parent = new int[parent];
	}

	public int[][] input(int dot, int array[][]) {
		int x = 1;
		int n = 2;
		for (int row = 0; row < dot; row++) {
			for (int col = x; col < dot; col++) {
				System.out.print("Enter distant " + (x) + "=>" + (n) + " : ");
				array[row][col] = sc.nextInt();
				n = n + 1;
			}
			x = x + 1;
			n = x + 1;
		}
		for (int row = 0; row < dot; row++) {
			for (int col = 0; col < dot; col++) {
				if (array[row][col] == 0) {
					array[row][col] = INF;
				}
			}
		}
		// for (int row = 0; row < dot; row++) {
		// for (int col = 0; col < dot; col++) {
		// System.out.print(array[row][col] + ", ");
		// }
		// System.out.println(";");
		// }
		return array;
	}

	public int find(int i) {
		while (parent[i] != i)
			i = parent[i];
		return i;
	}

	public void union1(int i, int j) {
		int a = find(i);
		int b = find(j);
		parent[a] = b;
	}

	public void kruskalMST(int cost[][]) {
		int mincost = 0;

		for (int i = 0; i < V; i++) {
			parent[i] = i;
			// System.out.print(parent[i]);
		}
		// System.out.println();

		int edge_count = 0;
		while (edge_count < V - 1) {
			int min = INF, a = -1, b = -1;
			for (int i = 0; i < V; i++) {
				for (int j = 0; j < V; j++) {
					if (find(i) != find(j) && cost[i][j] < min) {
						min = cost[i][j];
						a = i;
						b = j;
					}
				}
			}

			union1(a, b);
			// System.out.printf("Edge %d:(%d, %d) cost:%d \n", edge_count++, a, b, min);
			System.out.println("Edge " + (edge_count + 1) + " : " + (a + 1) + " => " + (b + 1) + " distant : " + min);
			edge_count += 1;
			mincost += min;
		}
		//System.out.printf("\n Minimum distant = %d \n", mincost);
	}

}
