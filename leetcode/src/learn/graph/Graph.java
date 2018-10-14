package learn.graph;

import java.util.*;

/**
 * Graph without weight
 * @author zhu
 *
 */
public class Graph {
	int V;
	int[][] adjEdge;
	LinkedList<Integer>[] adjList;
	int[][] adjMatrix;

	public Graph(int V, int[][] adjEdge) {
		this.V = V;
		this.adjEdge = adjEdge;
	}
	
	public Graph(int V, LinkedList<Integer>[] adjList) {
		this.V = V;
		this.adjList = adjList;
	}
	
	public Graph(int[][] adjMatrix, int V) {
		this.V = V;
		this.adjMatrix = adjMatrix;
	}
	
	public static int[][] toAdjEdge(int[][] adjMatrix) {
		List<Pair> list = new ArrayList<>();
		for (int i=0; i < adjMatrix.length; i++) {
			for(int j=0; j < adjMatrix[i].length; j++) {
				if (adjMatrix[i][j] != 0) {
					list.add(new Pair(i, j, adjMatrix[i][j]));
				}
			}
		}
		
		int size = list.size();
		int[][] adjEdge = new int[size][3];
		Pair p;
		for(int i=0; i < size; i++) {
			p = list.get(i);
			adjEdge[i][0] = p.key;
			adjEdge[i][1] = p.value;
			adjEdge[i][2] = p.weight;
		}
		
		return adjEdge;
	}
	
	public static int[][] toAdjMatrix(int V, int[][] adjEdge) {
		return toAdjMatrix(V, adjEdge, false);
	}
	
	public static int[][] toAdjMatrix(int V, int[][] adjEdge, boolean directed) {
		if (V == 0 || adjEdge == null) {
			return null;
		}
		
		int[][] adjMatrix = new int[V][V];
		
		int row, col, weight;
		for(int i=0; i < adjEdge.length; i++) {
			row = adjEdge[i][0];
			col = adjEdge[i][1];
			weight = adjEdge[i][2];
			
			adjMatrix[row][col] = weight;
			if (directed) {
				adjMatrix[col][row] = weight;
			}
		}
		
		return adjMatrix;
	}
	
	public static HashMap<Integer, LinkedList<Integer>> toAdjList(int V, int[][] adjEdge) {
		if (V == 0 || adjEdge == null) {
			return null;
		}
		
		HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<>();
		
		for (int i=0; i < V; i++) {
			adjList.put(i, new LinkedList<>());
		}
		
		for (int i=0; i < adjEdge.length; i++) {
			adjList.get(adjEdge[i][0]).add(adjEdge[i][1]);
		}
		
		return adjList;
	}
}


class Pair {
	int key;
	int value;
	int weight;
	
	Pair(int key, int value) {
		new Pair(key, value, 1);
	}
	
	Pair(int key, int value, int weight) {
		this.key = key;
		this.value = value;
		this.weight = weight;
	}
}
