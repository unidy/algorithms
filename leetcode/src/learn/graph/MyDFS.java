package learn.graph;

import java.util.*;

public class MyDFS {
	
	public static void traverse(HashMap<Integer, LinkedList<Integer>> adjList, int start) {
		HashSet<Integer> visited = new HashSet<>();
		
		System.out.println("DFS traverse:");
		dfs(adjList, start, visited);
		System.out.println("");
	}
	
	private static void dfs(HashMap<Integer, LinkedList<Integer>> adjList, int start, HashSet<Integer> visited) {
		print(start);
		visited.add(start);
		for(int v: adjList.get(start)) {
			if(!visited.contains(v)) {
				dfs(adjList, v, visited);
			}
		}
	}
	
	private static void print(int vertex) {
		System.out.print("->" + vertex);
	}

}
