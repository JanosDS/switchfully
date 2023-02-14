package basic.codelab06;

import java.util.Objects;

public class CoolEmployee {
    private static final double SALARY_MONTHS_IN_A_YEAR = 13.9;
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public CoolEmployee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary * SALARY_MONTHS_IN_A_YEAR;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        this.salary += salary * percentage;
    }

    @Override
    public String toString() {
        return "(" + id + ") " + getFullName() + " - " + salary + " EUR / month";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoolEmployee that = (CoolEmployee) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
