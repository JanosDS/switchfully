package basic.solutions.codelab01;

public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "engine with " + horsePower + " horse-power";
    }
}
