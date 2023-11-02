package miniProject_eveningPractice.enumReflections;

import java.lang.reflect.Constructor;

public class ReportGenerator {
    public static ReportInterface generateRep(Report reportType) {
        try {
            //TODO: check the name
            String packageName = "miniProject_eveningPractice.enumReflections";
            String type = reportType.name().charAt(0) + reportType.name().substring(1).toLowerCase();
            String className = packageName + "." + type + "Report";
            System.out.println(className);
            Class<?> reportClass = Class.forName(className);

            if (Report.class.isAssignableFrom(reportClass)) {
                Constructor<?> constructor = reportClass.getConstructor();
                return (ReportInterface) constructor.newInstance();
            } else {
                throw new IllegalArgumentException("Invalid report type");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Report selectedReport = Report.EMPLOYEE;
        ReportInterface report = generateRep(selectedReport);
    }
}

interface ReportInterface {
    void generateReport();
}

class EmployeeReport implements ReportInterface {
    @Override
    public void generateReport() {
        System.out.println("Employee Report");
    }
}
class DepartmentReport implements ReportInterface {
    @Override
    public void generateReport() {
        System.out.println("Department Report");
    }
}
class HierarchyReport implements ReportInterface {
    @Override
    public void generateReport() {
        System.out.println("Hierarchy Report");
    }
}

