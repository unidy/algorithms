package learn.graph.mine;

public class Edge {
	int src;
	int dest;
	int weight = 1;

	public Edge(int src, int dest, int weight) {
		super();
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}

	public Edge(int src, int desc) {
		new Edge(src, desc, 1);
	}

	public Edge(int[] data) {
		this.src = data[0];
		this.dest = data[1];
		this.weight = data.length == 3 ? data[2] : 1;
	}
	
	public String toString() {
		return "{" + src + ", " + dest + ", " + weight + "}";
	}
}
