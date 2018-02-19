import java.util.LinkedList;

//visited all connected nodes 1st then go deeper
//Shortest Path and Minimum Spanning Tree for unweighted graph
//Peer to Peer Networks. In Peer to Peer Networks like BitTorrent, Breadth First Search is used to find all neighbor nodes.
//Social Networking Websites: In social networks, we can find people within a given distance ‘k’ from a person using Breadth First Search till ‘k’ levels.
//GPS Navigation systems: Breadth First Search is used to find all neighboring locations.
//In Garbage Collection.Breadth First Search is preferred over Depth First Search because of better locality of reference.

public class BFSDirectedGraph {

	public static void BFS(int src,DirectedGraph graph){

		boolean[] visited = new boolean[graph.V];
		LinkedList<Integer> list = new LinkedList<>();
		visited[src] = true;
		list.add(src);
		while(!list.isEmpty()){
			int node = list.poll();
			System.out.print(node);
			for(int i : graph.adjList[node]){
				if(!visited[i]){
					visited[i] = true;
					list.add(i);
				}
			}
		}
	}

}
