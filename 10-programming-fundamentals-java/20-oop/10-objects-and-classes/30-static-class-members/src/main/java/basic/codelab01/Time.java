package basic.codelab01;

import java.util.Objects;

public class Time {
    public static final int TEA_TIME_HOUR = 16;
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this(13, 30, 0.0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0.0);
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public static Time highestHour(Time time1, Time time2) {
        if (Math.max(time1.getHour(), time2.getHour()) == time1.getHour()) {
            return time1;
        }
        return time2;
    }

    @Override
    public String toString() {
        return "The time is " + hour + ":" + minute + ":" + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute && Double.compare(time.second, second) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }
}
