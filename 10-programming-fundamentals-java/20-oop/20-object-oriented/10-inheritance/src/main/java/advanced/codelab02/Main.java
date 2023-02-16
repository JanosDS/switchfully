package advanced.codelab02;

import org.springframework.boot.Banner;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("Member");
        Freemember freemember = new Freemember("Freemember");
        PayingMember payingMember = new PayingMember("Payingmember");
        Moderator mod = new Moderator("moderator trus", true);
        Moderator mod2 = new Moderator("Untrusted", false);

        System.out.println(member.signIn());
        System.out.println(freemember.signIn());
        System.out.println(payingMember.signIn());
        System.out.println(mod2.signIn());
        System.out.println(mod.signIn());
    }
}
