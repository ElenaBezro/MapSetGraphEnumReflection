package miniProject_eveningPractice;

import miniProject_eveningPractice.treeStructure.Tree;
import miniProject_eveningPractice.treeStructure.TreeNode;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import static miniProject_eveningPractice.Util.fillMS;
import static miniProject_eveningPractice.Util.fillMS2;

public class Main {
    public static void main(String[] args) {
//        ManagerSystem managerSystem = fillMS();
//
//        Set<Employee> employeeSet = managerSystem.getEmployeeSet();
//        System.out.println("employeeSet");
//        System.out.println(employeeSet);
//
//        Map<Integer, Employee> employeeByIdMap = managerSystem.getEmployeeByIdMap();
//        System.out.println("employeeByIdMap");
//        System.out.println(employeeByIdMap);
//
//        System.out.println("getEmployeeById");
//        try {
//            System.out.println(managerSystem.getEmployeeById(101));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println("displayEmployeesByDepartment");
//            managerSystem.displayEmployeesByDepartment("Logistic");
//            System.out.println("displayEmployeesByJobTitle");
//            managerSystem.displayEmployeesByJobTitle("BackEnd Developer");
//            System.out.println("displayEmployeesByManager");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            managerSystem.displayEmployeesByManager(102);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        managerSystem.displayReport();

        //Day2 Binary Tree
        Employee employee1 = new Employee("CEO", 1, "Executive", "CEO", 0, new Date(), 100000.0);
        Employee employee2 = new Employee("Manager A", 2, "IT", "Manager", 1, new Date(), 80000.0);
        Employee employee3 = new Employee("Employee A1", 3, "HR", "HR Assistant", 2, new Date(), 50000.0);
        Employee employee4 = new Employee("Manager C", 4, "IT", "Manager", 1, new Date(), 60000.0);
        Employee employee5 = new Employee("Employee A1", 5, "HR", "Assistant", 2, new Date(), 50000.0);
        Employee employee6 = new Employee("Employee C1", 6, "HR", "Assistant", 4, new Date(), 50000.0);
        Employee employee7 = new Employee("Employee C1", 7, "HR", "HR Assistant", 4, new Date(), 50000.0);
        Employee employee8 = new Employee("Junior Employee C2", 8, "HR", "HR Assistant", 7, new Date(), 50000.0);
        Employee employee9 = new Employee("Manager B", 9, "HR", "Manager", 1, new Date(), 75000.0);

        try {
            Tree subordinateTree = new Tree(employee1);

            subordinateTree.addNode(employee1);
            subordinateTree.addNode(employee2);
            subordinateTree.addNode(employee3);
            subordinateTree.addNode(employee4);
            subordinateTree.addNode(employee5);
            subordinateTree.addNode(employee6);
            subordinateTree.addNode(employee7);
            subordinateTree.addNode(employee8);
            subordinateTree.addNode(employee9);
            subordinateTree.printHierarchy(subordinateTree.getRootNode());
            subordinateTree.displayHierarchy(subordinateTree.getRootNode(), 4);
            System.out.println(subordinateTree.findLowestCommonManager(subordinateTree.getRootNode(), 8, 6));

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
