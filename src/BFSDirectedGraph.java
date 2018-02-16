import java.util.LinkedList;

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
