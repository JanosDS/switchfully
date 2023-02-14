package basic.codelab03;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public int calculateAllowance() {
        if (0 < age && age <= 12) {
            return 100;
        }
        if (age < 18) {
            return (100 + (age - 12) * 5);
        }
        return 0;
    }
}
