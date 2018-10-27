package learn.graph.mine;

import java.util.*;

public class BFSTraverse {

	public static List<Integer> traverse(Graph graph, int start) {
		List<LinkedList<Edge>> adjList = graph.toAdjList();
		List<Integer> visited = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(start);
		
		int v;
		while (!queue.isEmpty()) {
			v = queue.poll();
			visited.add(v);
			
			for(Edge edge: adjList.get(v)) {
				if (!visited.contains(edge.dest)) {
					queue.offer(edge.dest);
				}
			}
		}
		
		return visited;
		
	}
	
	private static void BFS(List<LinkedList<Edge>> adjList, int start, List<Integer> visited) {
		
	}
}
