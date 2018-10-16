package learn.graph.mine;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import learn.graph.GraphData;
import learn.graph.Utils;

public class BFSTraverseTest {

	@Test
	public void test() {
		Utils.printAdjEdge(GraphData.adjEdge);

		Graph graph = new Graph(GraphData.V, GraphData.adjEdge);

		GraphUtils.printAdjList(graph.toAdjList());

		List<Integer> tree = BFSTraverse.traverse(graph, 0);

		System.out.println("DFS:");
		GraphUtils.printList(tree);
		System.out.println("");
		
		tree = BFSTraverse.traverse(graph, 1);

		System.out.println("DFS:");
		GraphUtils.printList(tree);
	}

}
