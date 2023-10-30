package miniProject_eveningPractice;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static miniProject_eveningPractice.Util.fillMS;

public class ManagerSystem {

    private List<Employee> employeeList = new ArrayList<>();
    private Map<Integer, Employee> employeeByIdMap = new HashMap<>();

    public void addEmployee(Employee newEmployee) throws EmployeeIdAlreadyExistsException {
        for (Employee employee : employeeList) {
            if (employee.getId() == newEmployee.getId()) ;
            {
                throw new EmployeeIdAlreadyExistsException("Employee With Such Id Already Exists");
            }
        }
        employeeList.add(newEmployee);
        employeeByIdMap.put(newEmployee.getId(), newEmployee);
    }

    public void removeEmployee(int id) {
        employeeList = employeeList.stream().filter(employee -> employee.getId() != id).toList();
        employeeByIdMap.remove(id);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public HashSet<Employee> getEmployeeSet() {
        return new HashSet<>(employeeList);
    }

    public Map<Integer, Employee> getEmployeeByIdMap() {
        return employeeList.stream()
                .collect(Collectors
                        .toMap(employee -> employee.getId(), employee -> employee));
    }

    public Employee getEmployeeById(int id) throws InvalidIdException {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            } else {
                throw new InvalidIdException("Invalid id");
            }
        }
        return null;
    }

    public void displayEmployeesByDepartment(String department) throws InvalidInputException {
        List<Employee> list = employeeList.stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .toList();

        if (list.isEmpty()) {
            throw new InvalidInputException("Invalid input");
        }

        list.forEach(System.out::println);
    }

    public void displayEmployeesByJobTitle(String jobTitle) throws InvalidInputException {
        List<Employee> list = employeeList.stream()
                .filter(employee -> employee.getJobTitle().equals(jobTitle))
                .toList();

        if (list.isEmpty()) {
            throw new InvalidInputException("Invalid input");
        }

        list.forEach(System.out::println);
    }

    public void displayEmployeesByManager(int managerId) throws InvalidIdException {
        List<Employee> list = employeeList.stream()
                .filter(employee -> employee.getManagerId() == managerId)
                .toList();

        if (list.isEmpty()) {
            throw new InvalidIdException("Invalid id");
        }

        list.forEach(System.out::println);
    }

    public void displayReport() {
        //TODO: What if one employee is performing two jobs?
        System.out.println("Total employees: " + employeeList.size());

        Map<String, List<Employee>> employeesToDepartmentMap = employeeList.stream()
                .collect(groupingBy(employee -> employee.getDepartment()));

        employeeList.stream()
                .collect(groupingBy(employee -> employee.getDepartment()))
                .entrySet()
                .forEach(entry -> {
                    System.out.println("Department: " + entry.getKey());
                    System.out.println("Employee in department " + entry.getKey() + ": " + entry.getValue());

                });
    }

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
