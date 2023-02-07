package codelab05;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        alarm.makeSound();
        Alarm alarm1 = new Alarm("tuuuut");
        alarm1.makeSound(5);
    }
}
