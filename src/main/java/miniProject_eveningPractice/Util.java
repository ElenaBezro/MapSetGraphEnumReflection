package miniProject_eveningPractice;

import java.util.Date;

public class Util {
    public static ManagerSystem fillMS() {
        ManagerSystem managerSystem = new ManagerSystem();
        Employee employee1 = new Employee("Lena", 101, "Logistic", "BackEnd Developer", 102);
        Employee employee2 = new Employee("Joyce", 102, "Logistic", "Engineering Manager", 102);
        Employee employee3 = new Employee("Peter", 103, "Warehouse Management", "BackEnd Developer", 110);
        Employee employee4 = new Employee("Mila", 104, "Planning", "FrontEnd Developer", 102);
// Adding employees to the organization hierarchy
        try {
            managerSystem.addEmployee(employee1);
            managerSystem.addEmployee(employee2);
            managerSystem.addEmployee(employee3);
            managerSystem.addEmployee(employee4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return managerSystem;
    }

    public static ManagerSystem fillMS2() {
        ManagerSystem managerSystem2 = new ManagerSystem();
// Adding employees to the organization hierarchy
        try {
            managerSystem2.addEmployee(new Employee("CEO", 1, "Executive", "CEO", 0, new Date(), 100000.0));
            managerSystem2.addEmployee(new Employee("Manager A", 2, "IT", "Manager", 1, new Date(), 80000.0));
            managerSystem2.addEmployee(new Employee("Manager B", 3, "HR", "Manager", 1, new Date(), 75000.0));
            managerSystem2.addEmployee(new Employee("Employee X", 4, "IT", "Developer", 2, new Date(), 60000.0));
            managerSystem2.addEmployee(new Employee("Employee Y", 5, "HR", "HR Assistant", 3, new Date(), 50000.0));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return managerSystem2;
    }
}
