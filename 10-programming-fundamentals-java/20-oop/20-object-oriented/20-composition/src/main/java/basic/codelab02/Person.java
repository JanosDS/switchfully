package basic.codelab02;

public class Person {
    private String fullName;
    private String emailAddress;

    public Person(String fullname, String email) {
        this.fullName = fullname;
        this.emailAddress = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
