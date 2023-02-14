package basic.codelab02;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        if (firstName == null) {
            return "";
        }
        return firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            return "";
        }
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getStreet() {
        return address.getStreet();
    }

    public String getHouseNumber() {
        return address.getHouseNumber();
    }

    public String getZipCode() {
        return address.getZipCode();
    }

    public String getCity() {
        return address.getCity();
    }

    public String getCountry() {
        return address.getCountry();
    }

    public boolean hasAddress() {
        return address != null;
    }
}
