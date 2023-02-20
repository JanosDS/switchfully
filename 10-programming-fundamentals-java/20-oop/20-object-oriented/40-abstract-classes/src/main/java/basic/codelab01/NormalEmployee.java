package basic.codelab01;

public class NormalEmployee extends Employee {
    public NormalEmployee(String name, double annualSalary) {
        super(name, annualSalary);
    }

    @Override
    public double getMonthlySalary() {
        return getAnnualSalary() / 12;
    }
}
