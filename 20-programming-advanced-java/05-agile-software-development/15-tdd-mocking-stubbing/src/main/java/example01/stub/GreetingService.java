package example01.stub;

public class GreetingService {

    private TimeService timeService;

    public GreetingService(TimeService timeService) {
        this.timeService = timeService;
    }

    public String getGreeting() {
        if (timeService.getHourOfTheDay() >= 12) {
            return "Good Evening";
        }
        return "Good Morning";
    }

    public void printGreeting() {
        System.out.println(getGreeting());
    }
}
