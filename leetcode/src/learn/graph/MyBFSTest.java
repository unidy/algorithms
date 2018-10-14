package learn.graph;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Ignore;
import org.junit.Test;

public class MyBFSTest {

	@Test
	@Ignore
	public void test() {
		int[][] adjEdge = GraphData.adjEdge;
		HashMap<Integer, LinkedList<Integer>> adjList = Graph.toAdjList(4, adjEdge);
		Utils.printAdjEdge(adjEdge);
		Utils.printAdjList(adjList);

		MyBFS.traverse(adjList, 0);

		MyBFS.traverse(adjList, 1);

		MyBFS.traverse(adjList, 2);
	}

	@Test
	public void test2() {
		Utils.printAdjMatrix(GraphData.adjMatrix);
		int[][] adjEdge = Graph.toAdjEdge(GraphData.adjMatrix);
		Utils.printAdjEdge(adjEdge);
		
		HashMap<Integer, LinkedList<Integer>> adjList = Graph.toAdjList(GraphData.adjMatrix.length, adjEdge);
		Utils.printAdjList(adjList);

		MyBFS.traverse(adjList, 0);
		MyDFS.traverse(adjList, 0);

	}
}
