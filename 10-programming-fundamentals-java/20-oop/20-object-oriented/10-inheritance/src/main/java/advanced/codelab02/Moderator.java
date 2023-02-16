package advanced.codelab02;

public class Moderator extends Member {

    private boolean isTrusted;

    public Moderator(String username, boolean isTrusted) {
        super(username);
        this.isTrusted = isTrusted;
    }

    @Override
    public String signIn() {
        super.updatedLastSignedInOn();
        if (isTrusted) {
            return "'Sup mod " + super.getUsername() + "!? The last time you signed in was " + super.getLastSignedInOn();
        }
        return "Welcome " + super.getUsername() + ", the last time you signed in was " + super.getLastSignedInOn();
    }
}
