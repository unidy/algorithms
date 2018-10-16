package learn.graph.mine;

import java.util.*;

public class DFSTraverse {

	public static List<Integer> traverse(Graph graph, int start) {
		List<LinkedList<Edge>> adjList = graph.toAdjList();
		List<Integer> visited = new ArrayList<>();

		DFS(adjList, start, visited);
		
		return visited;
	}
	
	private static void DFS(List<LinkedList<Edge>> adjList, int start, List<Integer> visited) {
		visited.add(start);
		
		for(Edge edge: adjList.get(start)) {
			if (!visited.contains((Integer)edge.desc)) {
				DFS(adjList, edge.desc, visited);
			}
		}
	}
}
