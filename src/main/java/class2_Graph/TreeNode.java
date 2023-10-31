package class2_Graph;

public class TreeNode {
    //1.Binary Tree Node:
    //Create a class named TreeNode with an integer data field.
    //Include fields for left and right child references (left and right) in the TreeNode class.
    //Write a constructor for the TreeNode class that initializes the data field and sets left and right to null.
    //
    //2.Binary Tree Creation:
    //Create a binary tree by manually specifying its structure, including a root node and its children.
    //Use the TreeNode class you created in the previous task to build the binary tree.
    //Print the values of the nodes to demonstrate the structure of the tree.
    //
    //3. Inserting an Element:
    //   Implement a method to insert a new element into the binary tree while maintaining the binary search tree (BST) property.
    //   Explain the concept of a binary search tree, where nodes to the left have values less than the current node, and nodes to the right have values greater than the current node.
    //   Demonstrate how to insert elements into the binary tree while preserving the BST property.
    //
    //
    //4.Finding an Element:
    //Implement a method to search for a specific value in the binary tree.
    //Explain the recursive approach for searching:
    //If the current node is null, return false because the value is not found.
    //If the current node's data matches the target, return true.
    //Otherwise, recursively search in the left and right subtrees.
    //Create a binary tree and use the search method to find specific values.
    //
    //5.Deleting an Element:
    //Implement a method to delete a specific element from the binary tree while maintaining the BST property.
    //Explain the different cases when deleting a node:
    //Node has no children (leaf node): Simply remove the node.
    //Node has one child: Replace the node with its child.
    //Node has two children: Find the in-order successor or predecessor to replace the node.
    //Demonstrate how to delete elements from the binary tree while preserving the BST property.
    int data;
}
