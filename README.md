Morning session

Graph Representation:
Create a Java class named Graph that will represent a graph using adjacency lists.
Initialize an empty adjacency list (a map) in the constructor.
Implement a method called addVertex(int v) to add a vertex to the graph by adding an entry in the adjacency list.
Implement a method called addEdge(int v1, int v2) to add an edge between two vertices in the graph. Make sure to add both vertices to each other's adjacency lists for an undirected graph.
Implement a method called getNeighbors(int v) that returns a list of neighbors for a given vertex v.

2.Depth-First Search (DFS):
Create a method named dfs that takes a Graph object, a starting vertex v, and a Set to keep track of visited vertices.
Inside the dfs method, mark the current vertex v as visited by adding it to the visited set.
Print the value of the current vertex v to show the traversal order.
Iterate through the neighbors of v using graph.getNeighbors(v) and recursively call the dfs method for unvisited neighbors.

Depth-First Search (DFS) is a traversal algorithm that explores as far as possible along each branch before backtracking

3.Breadth-First Search (BFS):
Create a method named bfs that takes a Graph object and a starting vertex start.
Initialize an empty Set called visited and a Queue to store vertices to be processed.
Add the start vertex to the visited set and enqueue it in the queue.
Use a while loop to process vertices in the queue.
Dequeue a vertex from the queue, print it, and then enqueue its unvisited neighbors into the queue while marking them as visited.

Breadth-First Search (BFS) is a traversal algorithm that explores all the neighbor nodes at the current depth before moving on to the nodes at the next depth level.



Evening session


