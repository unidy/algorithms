package learn.graph;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class MyDFSTest {

	@Test
	public void test() {
		int[][] adjEdge = GraphData.adjEdge;
		HashMap<Integer, LinkedList<Integer>> adjList = Graph.toAdjList(4, adjEdge);
		Utils.printAdjEdge(adjEdge);
		Utils.printAdjList(adjList);
		
		MyDFS.traverse(adjList, 0);

		MyDFS.traverse(adjList, 1);
		
		MyDFS.traverse(adjList, 2);
	}
}
