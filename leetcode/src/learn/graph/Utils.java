package learn.graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Utils {

	public static void printAdjEdge(int[][] adjEdge) {
		System.out.println("AdjEdge:");
		
		for (int i=0; i < adjEdge.length; i++) {
			System.out.print(i + ":\t{");
			for (int j=0; j < adjEdge[i].length; j++) {
				System.out.print(adjEdge[i][j]);
				if (j < adjEdge[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}\n");
		}
		
		System.out.println("");
	}
	
	public static void printAdjMatrix(int[][] adjMatrix) {
		System.out.println("adjMatrix:");
		
		for (int i=0; i < adjMatrix.length; i++) {
			for (int j=0; j < adjMatrix[i].length; j++) {
				System.out.print(adjMatrix[i][j]);
				if (j < adjMatrix[i].length -1) {
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
	}
	
	public static void printAdjListWithoutWeight(HashMap<Integer, LinkedList<Integer>> adjList) {
		System.out.println("adjList:");
		
		int V = adjList.size();
		for(int i=0; i < V; i++) {
			System.out.print(i + ": ");
			for (int j=0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j));
				if (j < adjList.get(i).size() -1) {
					System.out.print("->");
				}
			}
			System.out.println("");
		}
	}

	public static void printAdjList(HashMap<Integer, LinkedList<Integer[]>> adjList) {
		System.out.println("adjList:");
		
		int V = adjList.size();
		Integer[] edge;
		for(int i=0; i < V; i++) {
			System.out.print(i + ": ");
			for (int j=0; j < adjList.get(i).size(); j++) {
				edge = adjList.get(i).get(j);
				System.out.print("{" + edge[0] + ", " + edge[1] + "}");
				if (j < adjList.get(i).size() -1) {
					System.out.print("->");
				}
			}
			System.out.println("");
		}
	}
}
