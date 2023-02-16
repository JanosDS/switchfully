package advanced.codelab01;

public enum TrafficLightColor {
    RED("Red"),
    RNG("Orange"),
    GRN("Green");

    private String label;

    TrafficLightColor(String label) {
        this.label = label;
    }

    public boolean canChangeTo(TrafficLightColor color) {
        if (this == GRN && color == RED) {
            return false;
        }
        if (this == RED && color == RNG) {
            return false;
        }
        return true;
    }

    public String getLabel() {
        return label;
    }

    public String allColorsToString() {
        String str = "";
        for (TrafficLightColor color : TrafficLightColor.values()) {
            str += color.getLabel() + ", ";
        }
        return str;
    }
}
