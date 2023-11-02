package miniProject_eveningPractice;

import java.util.Date;

public class Employee implements Comparable<Employee> {
    String name;
    int id;
    String department;
    String jobTitle;
    int managerId;
    Date hireDate;
    Double salary;

    public Employee(String name, int id, String department, String jobTitle, int managerId) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.jobTitle = jobTitle;
        this.managerId = managerId;
    }

    public Employee(String name, int id, String department, String jobTitle, int managerId, Date hireDate, Double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.jobTitle = jobTitle;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee: {name: "+ name  +
                    ", id=" + id +
                    ", department=" + department +
                    ", jobTitle=" + jobTitle +
                    ", managerId=" + managerId +
                    '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.getId(), o.getManagerId());
    }
}
