package class2_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> adjList;

    public Graph () {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        Vertex vertex = new Vertex(v);
        adjList.put(vertex, new ArrayList<>());
    }
//TODO: what if vertex1 or vertex2 is not in adjList?
    public void addEdge(int v1, int v2) {
        Vertex vertex1 = new Vertex(v1);
        Vertex vertex2 = new Vertex(v2);
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
    }

    public List<Vertex> getNeighbors(int v) {
        return adjList.getOrDefault(new Vertex(v), null);
    }
}
