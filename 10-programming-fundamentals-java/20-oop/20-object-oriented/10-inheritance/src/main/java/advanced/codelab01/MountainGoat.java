package advanced.codelab01;

public class MountainGoat extends Goat {
    public MountainGoat(int age, Health health) {
        super(age, health);
    }

    public String climb() {
        return "Climbing a rock ...";
    }

    @Override
    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age can not be under 1");
        } else if (age > 8) {
            throw new IllegalArgumentException("Mountain goat Age can not be over 8");
        } else {
            this.age = age;
        }
    }
}
