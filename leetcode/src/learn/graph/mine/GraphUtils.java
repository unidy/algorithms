package learn.graph.mine;

import java.util.*;

public class GraphUtils {

	/**
	 * Print Adjacency Edges
	 * 
	 * @param edges
	 */
	public static void printAdjEdge(List<Edge> edges) {
		println("Adjacency Edges:");

		int i = 0;
		for (Edge edge : edges) {
			println(i++ + ":\t" + edge.toString());
		}
	}

	/**
	 * Print Adjacency Matrix
	 * 
	 * @param matrix
	 */
	public static void printAdjMatrix(int[][] matrix) {
		println("Adjacency Matrix:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				print(matrix[i][j] + "\t");
			}
			println("");
		}
	}

	public static void printAdjList(List<LinkedList<Edge>> adjList) {
		println("Adjacency List:");

		Edge edge;
		for (int i = 0; i < adjList.size(); i++) {
			print(i + ":\t");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				edge = adjList.get(i).get(j);
				print(edge);
				if (j < adjList.get(i).size() - 1) {
					print(" -> ");
				}
			}
			println("");
		}
	}

	public static void printList(List<Integer> list) {
		for(int i=0; i < list.size(); i++) {
			print(list.get(i));
			if (i < list.size() -1) {
				print(" -> ");
			}
		}
	}
	
	private static void print(Object o) {
		System.out.print(o);
	}

	private static void println(Object o) {
		System.out.println(o);
	}
}
