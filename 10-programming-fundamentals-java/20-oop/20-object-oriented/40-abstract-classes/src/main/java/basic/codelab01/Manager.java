package basic.codelab01;

public class Manager extends Employee {
    private final int MIN_BONUS = 100;
    private final int MAX_BONUS = 250;
    private int bonus;

    public Manager(String name, double annualSalary, int bonus) {
        super(name, annualSalary);
        setBonus(bonus);
    }

    public void setBonus(int bonus) {
        if (MIN_BONUS > bonus) {
            this.bonus = MIN_BONUS;
        } else if (bonus > MAX_BONUS) {
            this.bonus = MAX_BONUS;
        } else {
            this.bonus = bonus;
        }
    }

    @Override
    public double getMonthlySalary() {
        return getAnnualSalary() / 11;
    }
}
