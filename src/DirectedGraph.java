import java.util.LinkedList;

public class DirectedGraph implements Graph<DirectedGraph>{
	
	int V;
	LinkedList<Integer> adjList[];
	
	public DirectedGraph(int V) {
		this.V = V;
		
		adjList = new LinkedList[V];
		
		for(int i=0;i<V;i++){
			adjList[i] = new LinkedList<>();
		}
	}

	@Override
	public void addNode(DirectedGraph graph, int src, int dest) {
		graph.adjList[src].add(dest);
	}

	@Override
	public void printGraph(DirectedGraph graph) {
		for(int i=0;i<V;i++){
			for(Integer num : graph.adjList[i]){
				System.out.print(num);
			}
			System.out.println();
		}
	}

	
	
}
