//visit 1st node to the connecting node and go deeper
//Detecting cycle in a graph
//Path Finding
///Topological Sorting is mainly used for scheduling jobs from the given dependencies among jobs
public class DFSDirectedGraph {

	public static void DFSUtil(int src, DirectedGraph graph){
		boolean[] visited = new boolean[graph.V];
		DFS(graph,visited,src);
	}
	
	public static void DFS(DirectedGraph graph,boolean[] visited, int src){
		
		visited[src] = true;
		System.out.print(src);
		
		for(Integer i : graph.adjList[src]){
			if(!visited[i])
				DFS(graph, visited, i);
		}
		
	}
	
}
