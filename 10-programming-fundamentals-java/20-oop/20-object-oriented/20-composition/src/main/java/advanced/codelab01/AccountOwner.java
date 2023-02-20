package advanced.codelab01;

public class AccountOwner {
    private String firstname;
    private String lastname;

    public AccountOwner(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Mr. or Mrs. " + firstname + ", " + lastname;
    }
}
