import java.util.LinkedList;

public class UndirectedGraph implements Graph<UndirectedGraph>{
	
	int V;
	LinkedList<Integer> adjList[]; 
	
	public UndirectedGraph(int V){
		this.V = V;
		adjList = new LinkedList[V];
		for(int i=0;i<V;i++){
			adjList[i] = new LinkedList<>();
		}
	}


	@Override
	public void addNode(UndirectedGraph graph, int src, int dest) {
		graph.adjList[src].addFirst(dest);
		graph.adjList[dest].addFirst(src);
	}


	@Override
	public void printGraph(UndirectedGraph graph) {
		for(int i=0;i<graph.V;i++){
			for(Integer num : graph.adjList[i]){
				System.out.print(num);
			}
			System.out.println();
		}
	}


}
