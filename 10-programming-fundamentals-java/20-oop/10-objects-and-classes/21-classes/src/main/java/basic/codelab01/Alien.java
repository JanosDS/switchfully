package basic.codelab01;

public class Alien {
    private String firstName;
    private String lastName;
    private int numberOfHeads;

    public Alien() {
        this.firstName = "Unidentified";
        this.lastName = "Unidentified";
        this.numberOfHeads = 1;
    }

    public Alien(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.numberOfHeads = 1;
    }

    public Alien(String firstname, String lastname, int numberOfHeads) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.numberOfHeads = numberOfHeads;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
