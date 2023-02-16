package basic.codelab01;

public class HumanApplication {
    public static void main(String[] args) {
        Human frank = new Human("Frank", "Friet", Gender.MALE);
        System.out.println(frank.toString());
    }
}
