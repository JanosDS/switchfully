package advanced.codelab01;

public enum TrafficLightColor {
    RED,
    ORANGE,
    GREEN;

    public boolean canChangeTo(TrafficLightColor color) {
        if (this == GREEN && color == RED) {
            return false;
        }
        if (this == RED && color == ORANGE) {
            return false;
        }
        return true;
    }

    public String allColorsToString() {
        String str = "";
        for (TrafficLightColor color : TrafficLightColor.values()) {
            str += color.toString() + ", ";
        }
        return str;
    }
}
