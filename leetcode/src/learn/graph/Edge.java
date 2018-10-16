package learn.graph;

public class Edge {
	int src;
	int desc;
	int weight;
	
	public Edge(int src, int desc) {
		new Edge(src, desc, 1);
	}
	
	public Edge(int src, int desc, int weight) {
		super();
		this.src = src;
		this.desc = desc;
		this.weight = weight;
	}
}
