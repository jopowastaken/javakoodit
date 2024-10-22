package tuntiteht3;

public class Employee {
    private String employeeName;
    private String jobtitle;
    private int experience;

    public Employee(String employeeName, String jobtitle, int experience) {
        this.employeeName = employeeName;
        this.jobtitle = jobtitle;
        this.experience = experience;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", experience=" + experience +
                '}';
    }
}
