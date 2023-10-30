package miniProject_eveningPractice;

import java.util.Map;
import java.util.Set;

import static miniProject_eveningPractice.Util.fillMS;

public class Main {
    public static void main(String[] args) {
        ManagerSystem managerSystem = fillMS();

        Set<Employee> employeeSet = managerSystem.getEmployeeSet();
        System.out.println("employeeSet");
        System.out.println(employeeSet);

        Map<Integer, Employee> employeeByIdMap = managerSystem.getEmployeeByIdMap();
        System.out.println("employeeByIdMap");
        System.out.println(employeeByIdMap);

        System.out.println("getEmployeeById");
        try {
            System.out.println(managerSystem.getEmployeeById(101));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("displayEmployeesByDepartment");
            managerSystem.displayEmployeesByDepartment("Logistic");
            System.out.println("displayEmployeesByJobTitle");
            managerSystem.displayEmployeesByJobTitle("BackEnd Developer");
            System.out.println("displayEmployeesByManager");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            managerSystem.displayEmployeesByManager(102);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        managerSystem.displayReport();
    }
}
