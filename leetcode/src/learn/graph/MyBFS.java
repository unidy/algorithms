package learn.graph;

import java.util.HashMap;
import java.util.*;

public class MyBFS {
	
	public static void traverse(HashMap<Integer, LinkedList<Integer>> adjList, int start) {
		HashSet<Integer> visited = new HashSet<>();
		
		System.out.println("BFS traverse:");
		bfs(adjList, start, visited);
		System.out.println("");
	}
	
	private static void bfs(HashMap<Integer, LinkedList<Integer>> adjList, int start, HashSet<Integer> visited) {
//		print(start);
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		
		Integer v;
		visited.add(start);
		while (!queue.isEmpty()) {
			v = queue.poll();
			print(v);
			
			for(Integer u: adjList.get(v)) {
				if (!visited.contains(u)) {
					queue.offer(u);
					visited.add(u);
				}
			}
		}
	}
	
	private static void print(int vertex) {
		System.out.print("->" + vertex);
	}

}
