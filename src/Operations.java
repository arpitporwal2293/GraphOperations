
public class Operations {
	
	public static UndirectedGraph addNodesUndirectedGraph(){
		UndirectedGraph unGraph = new UndirectedGraph(5);
		unGraph.addNode(unGraph, 0, 1);
		unGraph.addNode(unGraph, 0, 4);
		unGraph.addNode(unGraph, 1, 2);
		unGraph.addNode(unGraph, 1, 3);
		unGraph.addNode(unGraph, 1, 4);
		unGraph.addNode(unGraph, 2, 3);
		unGraph.addNode(unGraph, 3, 4);
		return unGraph;
	}
	
	public static void undirectedGraphOperations(){
		UndirectedGraph unGraph = addNodesUndirectedGraph();
		unGraph.printGraph(unGraph);
	}
	
	public static DirectedGraph addNodesDirectedGraph(){
		DirectedGraph graph = new DirectedGraph(5);
		graph.addNode(graph,0, 1);
		graph.addNode(graph,0, 2);
		graph.addNode(graph,1, 2);
		graph.addNode(graph,2, 0);
		graph.addNode(graph,2, 3);
		graph.addNode(graph,3, 3);
		return graph;
	}
	
	public static void directedGraphOperations(){
		DirectedGraph graph = addNodesDirectedGraph();
		graph.printGraph(graph);
	}
	
	public static void main(String[] args) {
		//undirectedGraphOperations();
		directedGraphOperations();
	}

}
