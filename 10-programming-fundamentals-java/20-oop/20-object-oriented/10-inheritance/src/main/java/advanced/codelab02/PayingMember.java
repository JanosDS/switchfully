package advanced.codelab02;

public class PayingMember extends Member {
    public PayingMember(String username) {
        super(username);
    }

    @Override
    public String signIn() {
        super.updatedLastSignedInOn();
        return "Dear honorary " + super.getUsername() + ", welcome! The last time you signed in was " + super.getLastSignedInOn();
    }
}
