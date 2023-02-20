package basic.codelab01;

public abstract class Employee {
    private String name;
    private double annualSalary;

    public Employee(String name, double annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public abstract double getMonthlySalary();

}
