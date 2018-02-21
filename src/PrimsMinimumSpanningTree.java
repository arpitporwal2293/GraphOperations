
public class PrimsMinimumSpanningTree {

	//return the node with the minimum distance
	public static int findMin(int[] key,Boolean[] mstSet,int nodes){
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		for(int i=0;i<nodes;i++){
			if(mstSet[i]==false && key[i]<min){
				min = key[i];
				min_index = i;
			}
		}

		return min_index;
	}

	public static void printMST(int parent[], int n, int graph[][])
	{
		System.out.println("Edge   Weight");
		for (int i = 1; i < n; i++)
			System.out.println(parent[i]+" - "+ i+"    "+
					graph[i][parent[i]]);
	}

	public static void primMST(int[][] graph,int nodes){
		//to keep the minimum spanning tree
		int[] parent = new int[nodes];

		//key values used to pick minimum values
		int[] key = new int[nodes];

		//to keep track of which nodes already included in mst
		Boolean[] mstSet = new Boolean[nodes];

		for(int i=0;i<nodes;i++){
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}

		key[0] = 0;
		parent[0] = -1;

		for(int count=0;count<nodes;count++){
			int u = findMin(key,mstSet,nodes);

			mstSet[u] = true;

			for(int v=0;v<nodes;v++){
				if(graph[u][v]!=0 && mstSet[v]==false && graph[u][v]<key[v]){
					parent[v] = u;
					key[v]= graph[u][v];
				}
			}
		}
		// print the constructed MST
		printMST(parent, nodes, graph);

	}


	public static void main(String[] args) {
		int graph[][] = new int[][] {{0, 2, 0, 6, 0},
			{2, 0, 3, 8, 5},
			{0, 3, 0, 0, 7},
			{6, 8, 0, 0, 9},
			{0, 1, 7, 9, 0}};

			// Print the solution
			primMST(graph,5);
	}

}
