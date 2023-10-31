package class2_Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    //3.Breadth-First Search (BFS):
    //Create a method named bfs that takes a Graph object and a starting vertex start.
    //Initialize an empty Set called visited and a Queue to store vertices to be processed.
    //Add the start vertex to the visited set and enqueue it in the queue.
    //Use a while loop to process vertices in the queue.
    //Dequeue a vertex from the queue, print it, and then enqueue its unvisited neighbors into the queue while marking them as visited.
    //
    //Breadth-First Search (BFS) is a traversal algorithm that explores all the neighbor nodes at the current depth before moving on to the nodes at the next depth level.
    public static void bfs(Graph graph, Vertex start) {
        System.out.println("start: " + start.getLabel());

        Set<Vertex> visitedVertices = new HashSet<>();
        Queue<Vertex> toProcess = new LinkedList<>();
        toProcess.add(start);
        visitedVertices.add(start);

        while (!toProcess.isEmpty()) {
            Vertex current = toProcess.poll();
            System.out.println(current.getLabel());

            for (Vertex nei : graph.getNeighbors(current.getLabel())) {
                if (!visitedVertices.contains(nei)) {
                    toProcess.add(nei);
                    visitedVertices.add(nei);
                }
            }
        }
    }

    public static void dfs(Graph graph, Vertex start, Set<Vertex> visitedVertices) {
        if (visitedVertices.isEmpty()) {
            System.out.println("Start: " + start.getLabel());
        }
        visitedVertices.add(start);

        for (Vertex neighborVertex : graph.getNeighbors(start.getLabel())) {
            if (!visitedVertices.contains(neighborVertex)) {
                System.out.println(neighborVertex.getLabel());
                dfs(graph, neighborVertex, visitedVertices);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(3);
        graph.addVertex(5);
        graph.addVertex(7);
        graph.addVertex(10);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(5, 7);
        graph.addEdge(5, 10);

        //Depth-First Search (DFS)
        System.out.println("Depth-First Search (DFS)");
        Set<Vertex> visitedVertices = new HashSet<>();
        dfs(graph, new Vertex(1), visitedVertices);
        System.out.println("Breadth-First Search (DFS)");
        bfs(graph, new Vertex(1));
    }
}
