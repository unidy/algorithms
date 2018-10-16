package learn.graph;

import java.util.*;

public class MyDFS {
	
	public static void traverse(HashMap<Integer, LinkedList<Integer[]>> adjList, int start) {
		HashSet<Integer> visited = new HashSet<>();
		
		System.out.println("DFS traverse:");
		dfs(adjList, start, visited);
		System.out.println("");
	}
	
	private static void dfs(HashMap<Integer, LinkedList<Integer[]>> adjList, int start, HashSet<Integer> visited) {
		print(start);
		visited.add(start);
		for(Integer[] v: adjList.get(start)) {
			if(!visited.contains(v[0])) {
				dfs(adjList, v[0], visited);
			}
		}
	}
	
	private static void print(int vertex) {
		System.out.print("->" + vertex);
	}

}
