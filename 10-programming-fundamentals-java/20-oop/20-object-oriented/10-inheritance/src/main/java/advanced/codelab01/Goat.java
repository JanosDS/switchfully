package advanced.codelab01;

public class Goat {
    protected int age;
    private Health health;

    public Goat(int age, Health health) {
        setAge(age);
        this.health = health;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age can not be under 1");
        } else if (age > 10) {
            throw new IllegalArgumentException("Age can not be over 10");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public Health getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Goat - " + age + " years old - doing " + getHealth();
    }
}
