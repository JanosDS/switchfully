package basic.codelab02;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
