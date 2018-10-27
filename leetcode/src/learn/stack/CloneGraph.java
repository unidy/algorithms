package learn.stack;

import java.util.*;

public class CloneGraph {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		UndirectedGraphNode clone = new UndirectedGraphNode(node.label);

		List<Integer> visited = new ArrayList<>();

		dfs(node, visited, clone);

		return clone;
	}

	private void dfs(UndirectedGraphNode start, List<Integer> visited, UndirectedGraphNode clone) {
		if (visited.contains(start.label)) {
			return;
		}

		visited.add(start.label);

		UndirectedGraphNode neighbor;
		for (UndirectedGraphNode node : start.neighbors) {
			neighbor = new UndirectedGraphNode(node.label);
			clone.neighbors.add(neighbor);

			dfs(node, visited, neighbor);
		}
	}

	public UndirectedGraphNode build(String s) {
		UndirectedGraphNode node = null, neighbor;
		int label;
		for (int i = 1; i < s.length() - 1; i++) {
			label = Integer.parseInt(String.valueOf(s.charAt(i)));
			node = new UndirectedGraphNode(label);

			while (s.charAt(i) != '#') {
				label = Integer.parseInt(String.valueOf(s.charAt(i)));
				neighbor = new UndirectedGraphNode(label);
				node.neighbors.add(neighbor);
			}
		}

		return node;
	}
}

class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
};

/**
 * https://leetcode.com/explore/learn/card/queue-stack/232/practical-application-stack/1392/
 * 
 * Given the head of a graph, return a deep copy (clone) of the graph. Each node
 * in the graph contains a label (int) and a list (List[UndirectedGraphNode]) of
 * its neighbors. There is an edge between the given node and each of the nodes
 * in its neighbors.
 * 
 * 
 * OJ's undirected graph serialization (so you can understand error output):
 * Nodes are labeled uniquely.
 * 
 * We use # as a separator for each node, and , as a separator for node label
 * and each neighbor of the node.
 * 
 * 
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * 
 * The graph has a total of three nodes, and therefore contains three parts as
 * separated by #.
 * 
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2. Second node
 * is labeled as 1. Connect node 1 to node 2. Third node is labeled as 2.
 * Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * 
 * 
 * Visually, the graph looks like the following:
 * 
 * 1 / \ / \ 0 --- 2 / \ \_/ Note: The information about the tree serialization
 * is only meant so that you can understand error output if you get a wrong
 * answer. You don't need to understand the serialization to solve the problem.
 **/