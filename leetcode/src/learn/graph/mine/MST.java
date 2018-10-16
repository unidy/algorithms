package learn.graph.mine;

import java.util.*;

public class MST {

	public static List<Edge> prim(Graph graph) {
		List<Edge> adjEdge = graph.toAdjEdge();

		Set<Integer> visited = new HashSet<>();
		Set<Integer> unvisited = new HashSet<>();
		List<Edge> edges = new ArrayList<>();
		
		for(int i=0; i< graph.V; i++) {
			unvisited.add(i);
		}
		
		Edge min;
//		for(int v=0; v < graph.V; v++) {
		int v = 0;
		unvisited.remove(v);
		visited.add(v);
		while (!unvisited.isEmpty()) {
			
			min = findMin(adjEdge, visited, unvisited);
			edges.add(min);
			v = min.desc;
			unvisited.remove(v);
			visited.add(v);
		}
		
		return edges;
	}
	
	/**
	 * Find the Edge with minimum weight which connects any vertex in visited to any vertex in unvisited
	 * 即在已访问节点集与未访问节点集中，找到最小的边
	 * @param adjEdge
	 * @param visited
	 * @param unvisited
	 * @return
	 */
	private static Edge findMin(List<Edge> adjEdge, Set<Integer> visited, Set<Integer> unvisited) {
		Edge min = null;
		
//		List<Edge> list;
		for(Integer i: visited) {
//			list = (List<Edge>)edges.stream().filter(e -> e.src == i);
			for(Edge edge: adjEdge) {
				if (edge.src == i && unvisited.contains(edge.desc)) {
					min = min == null || min.weight > edge.weight ? edge : min;
				}
			}
		}
		
		return min;
	}
}
