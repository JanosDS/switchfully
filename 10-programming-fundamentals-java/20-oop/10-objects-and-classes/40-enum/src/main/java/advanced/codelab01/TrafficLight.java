package advanced.codelab01;

public class TrafficLight {

    private TrafficLightColor color;
    private TrafficLightStatus status;

    public TrafficLight(TrafficLightColor color, TrafficLightStatus status) {
        this.color = color;
        this.status = status;
    }

    public void setStatus(TrafficLightStatus status) {
        this.status = status;
    }

    public void setColor(TrafficLightColor color) {
        if (color.canChangeTo(color)) {
            this.color = color;
        }
    }

    public String allTrafficLightColors() {
        return "All possible traffic light colors are: " + color.allColorsToString();
    }
}
