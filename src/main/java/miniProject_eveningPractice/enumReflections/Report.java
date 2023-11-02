package miniProject_eveningPractice.enumReflections;

public enum Report {
    EMPLOYEE(5),
    DEPARTMENT(3),
    HIERARCHY(7);
    int someValue;
    public int getSomeValue() {
        return someValue;
    }

    Report(int someValue) {
        this.someValue = someValue;
    }
}
