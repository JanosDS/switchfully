package advanced.codelab02;

import java.time.*;


public class Member {
    private String username;
    private LocalDate lastSignedInOn;

    public Member(String username) {
        this.username = username;
        updatedLastSignedInOn();
    }

    public String signIn() {
        updatedLastSignedInOn();
        return "Welcome " + username + ", the last tim you signed in was " + lastSignedInOn;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getLastSignedInOn() {
        return lastSignedInOn;
    }

    public void updatedLastSignedInOn() {
        lastSignedInOn = LocalDate.now();
    }
}
