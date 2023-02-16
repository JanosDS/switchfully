package advanced.codelab01;

public class TrafficLightApplication {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(TrafficLightColor.RED, TrafficLightStatus.DAMAGED);
        System.out.println(light.allTrafficLightColors());
    }
}
