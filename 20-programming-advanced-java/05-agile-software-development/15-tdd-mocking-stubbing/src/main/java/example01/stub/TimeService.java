package example01.stub;

import java.time.LocalDateTime;

public class TimeService {

    public int getHourOfTheDay() {
        return LocalDateTime.now().getHour();
    }
}
