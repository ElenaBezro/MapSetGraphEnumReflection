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

Binary Tree


1.Binary Tree Node:
Create a class named TreeNode with an integer data field.
Include fields for left and right child references (left and right) in the TreeNode class.
Write a constructor for the TreeNode class that initializes the data field and sets left and right to null.

2.Binary Tree Creation:
Create a binary tree by manually specifying its structure, including a root node and its children.
Use the TreeNode class you created in the previous task to build the binary tree.
Print the values of the nodes to demonstrate the structure of the tree.

3. Inserting an Element:
   Implement a method to insert a new element into the binary tree while maintaining the binary search tree (BST) property.
   Explain the concept of a binary search tree, where nodes to the left have values less than the current node, and nodes to the right have values greater than the current node.
   Demonstrate how to insert elements into the binary tree while preserving the BST property.


4.Finding an Element:
Implement a method to search for a specific value in the binary tree.
Explain the recursive approach for searching:
If the current node is null, return false because the value is not found.
If the current node's data matches the target, return true.
Otherwise, recursively search in the left and right subtrees.
Create a binary tree and use the search method to find specific values.

5.Deleting an Element:
Implement a method to delete a specific element from the binary tree while maintaining the BST property.
Explain the different cases when deleting a node:
Node has no children (leaf node): Simply remove the node.
Node has one child: Replace the node with its child.
Node has two children: Find the in-order successor or predecessor to replace the node.
Demonstrate how to delete elements from the binary tree while preserving the BST property.

TreeMap 

1.Basic TreeMap:
Create a TreeMap named ageMap to store key-value pairs where keys are names (strings) and values are ages (integers).
Use the put method to add entries for at least three individuals with their names and ages.
Retrieve the age of a specific person (e.g., Alice) using the get method.
Print the age of the specified person to verify that it was added correctly.

2.Default Sorting:
Create a TreeMap named defaultSortedMap to store integers as keys and strings as values.
Add entries to defaultSortedMap with integer keys and corresponding strings.
Demonstrate that the entries are automatically sorted by their keys (in ascending order) when you iterate through the map and print its contents.

3.Custom Sorting:
Define a custom class (e.g., Student) with fields for student names and IDs.
Create a custom comparator (e.g., StudentComparator) that compares Student objects based on their names or IDs.
Create a new TreeMap named customSortedMap that uses the custom comparator to order students by name or ID.
Add several Student objects to the customSortedMap with associated data.
Demonstrate that the map is ordered correctly based on the custom comparator by iterating through it and printing the names (or IDs) and data.


Evening session

Mini project

Graphs and Tree Integration

Project Description: On the second day, we'll build upon the existing
Employee Management System to represent the organization
hierarchy using a tree structure (e.g., binary tree), while incorporating
OOP and Collections.

Tasks:

Exercise 1

Extend the Employee class to include more information, such as hire
date and salary, and create constructors with appropriate
parameters.

Exercise 2

Create a tree structure (e.g., binary tree) to represent the organization
hierarchy based on manager-subordinate relationships, employing OOP
principles for node design.

Exercise 3

Implement methods to add employees to the hierarchy and establish
parent-child relationships while maintaining the tree's integrity.

Exercise 4

Implement methods to find the lowest common manager of two employees,
utilizing OOP for tree traversal.

Exercise 5

Display the organization hierarchy with proper indentation, emphasizing the
use of Collections for proper ordering and structure.

Exercise 6

Enhance the reporting functionality to include hierarchical reports (e.g.,
reporting to a specific manager), encapsulating tree operations.

Exercise 7

Add additional features such as finding the highest-paid employee or the
employee with the longest tenure, making use of Collections for efficient
data retrieval.

Exercise 8

Include error handling for hierarchical operations, ensuring that the tree
remains consistent.

