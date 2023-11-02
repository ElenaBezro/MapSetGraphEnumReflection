package miniProject_eveningPractice.treeStructure;

import miniProject_eveningPractice.Employee;

public class Tree {
    private TreeNode rootNode;

    public Tree(Employee rootNode) {
        this.rootNode = new TreeNode(rootNode);
    }

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void addNode(Employee employee) {
        addNode(rootNode, employee);
    }


    public void addNode(TreeNode current, Employee employee) {
        if (current.getValue().getId() > employee.getManagerId()) {
            if(current.getLeft() != null) {
                addNode(current.getLeft(), employee);
            }
            else {
                current.setLeft(new TreeNode(employee));
            }
        }
        if (current.getValue().getId() <= employee.getManagerId()) {
            if(current.getRight() != null) {
                addNode(current.getRight(), employee);
            }
            else {
                current.setRight(new TreeNode(employee));

            }
        }
    }

    public void printHierarchy(TreeNode current) {
        //in order to print tree in ascending order, I should:
        // 1 - go recursively to the most left node for current node and print it value (it's the smallest value in the tree/subtree)
        // 2 - Now the current node - is the most left node. If the current node has right node, repeat recursively from step 1 (treat this right node as a root node for a subtree)

        if (current.getLeft() != null) {
            printHierarchy(current.getLeft());
        }

        System.out.println(current.getValue());

        if (current.getRight() != null) {
            printHierarchy(current.getRight());
        }
    }

    //from Menil
    public void displayHierarchy(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        // Recur on the right subtree with increased depth
        displayHierarchy(node.getRight(), depth + 1);

        // Indent based on depth and display the current employee's information
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indentation.append("  ");
        }
        System.out.println(indentation + node.getValue().getName());

        // Recur on the left subtree with increased depth
        displayHierarchy(node.getLeft(), depth + 1);
    }

    //from Menil
    // Recursive method to find the lowest common manager of two employees
    // Exercise 4
    public Employee findLowestCommonManager(TreeNode node, int employeeId1, int employeeId2) {
        if (node == null) {
            return null;
        }

        // If either employeeId1 or employeeId2 is found, return the current node's employee
        if (node.getValue().getId() == employeeId1 || node.getValue().getId() == employeeId2) {
            return node.getValue();
        }

        // Recur on the left and right subtrees to find both employees
        Employee leftResult = findLowestCommonManager(node.getLeft(), employeeId1, employeeId2);
        Employee rightResult = findLowestCommonManager(node.getRight(), employeeId1, employeeId2);

        // If both employees are found in different subtrees, the current node's employee is the lowest common manager
        if (leftResult != null && rightResult != null) {
            return node.getValue();
        }

        // If only one employee is found, return that employee; otherwise, return null
        return leftResult != null ? leftResult : rightResult;
    }


}
