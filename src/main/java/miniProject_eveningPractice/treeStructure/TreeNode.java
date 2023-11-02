package miniProject_eveningPractice.treeStructure;

import miniProject_eveningPractice.Employee;

public class TreeNode {
    private Employee value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Employee value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Employee getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    //Exercise 4
    //
    //Implement methods to find the lowest common manager of two employees,
    //utilizing OOP for tree traversal.
}
