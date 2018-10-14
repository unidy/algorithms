package learn.graph.wangyingli;

import java.util.*;

/**
 * https://www.cnblogs.com/wangyingli/p/5974508.html?utm_source=tuicool&utm_medium=referral
 * @author zhu
 *
 */
//�����
class Edge implements Comparable<Edge>{
  private final int ver1;
  private final int ver2;
  private final Integer weight;
  public Edge(int ver1, int ver2, int weight) {
      super();
      this.ver1 = ver1;
      this.ver2 = ver2;
      this.weight = weight;
  }
  //����һ������
  public int either() {
      return ver1;
  }
  //������һ������
  public int other(int vertex) {
      if (vertex == ver1)
          return ver2;
      else if(vertex == ver2)
          return ver1;
      else 
          throw new RuntimeException("�߲�һ��");
  }
  @Override
  public int compareTo(Edge e) {
      return this.weight.compareTo(e.weight);
  }
  
  public Integer getWeight() {
      return weight;
  }
  @Override
  public String toString() {
      return "Edge [" + ver1 + "," + ver2 +"]";
  }
}

/**
* ��Ȩ����ͼ��ʵ��
*/
public class WeightedGraph {
  private final int vertexsNum;
  private final int edgesNum;
  private List<Edge>[] adj;
  
  public WeightedGraph(int[][] data, int vertexsNum) {
      this.vertexsNum = vertexsNum;
      this.edgesNum = data.length;
      adj  = (List<Edge>[]) new ArrayList[vertexsNum];
      for(int i=0; i<vertexsNum; i++) {
          adj[i] = new ArrayList<>();
      }

      for (int i = 0; i < data.length; i++) {
          Edge edge = new Edge(data[i][0],data[i][1],data[i][2]);
          int v = edge.either();
          adj[v].add(edge);
          adj[edge.other(v)].add(edge);
      }
  }
  
  public Iterable<Edge> adj(int vertex) {
      return adj[vertex];
  }

  public int getVertexsNum() {
      return vertexsNum;
  }

  public int getEdgesNum() {
      return edgesNum;
  }
  
  public Iterable<Edge> getEdges() {
      List<Edge> edges = new ArrayList<>();
      for(int i=0; i<vertexsNum; i++) {
          for(Edge e : adj[i]) {
              if(i > e.other(i)) { //����ͼ����ֹ��һ���߼�������
                  edges.add(e);
              }
          }
      }
      return edges;
  }
}
