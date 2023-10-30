package miniProject_eveningPractice;

public class Util {
    public static ManagerSystem fillMS() {
        ManagerSystem managerSystem = new ManagerSystem();
        Employee employee1 = new Employee("Lena", 101, "Logistic", "BackEnd Developer", 102 );
        Employee employee2 = new Employee("Joyce",102, "Logistic", "Engineering Manager", 102 );
        Employee employee3 = new Employee("Peter",103, "Warehouse Management", "BackEnd Developer", 110 );
        Employee employee4 = new Employee("Mila",104, "Planning", "FrontEnd Developer", 102 );

        try {
            managerSystem.addEmployee(employee1);
            managerSystem.addEmployee(employee2);
            managerSystem.addEmployee(employee3);
            managerSystem.addEmployee(employee4);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return managerSystem;
    }
}
