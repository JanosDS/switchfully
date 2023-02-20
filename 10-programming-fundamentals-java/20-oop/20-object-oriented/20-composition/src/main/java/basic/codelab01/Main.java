package basic.codelab01;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(20);
        Driver driver = new Driver("James", 18);
        Passenger[] passengers = new Passenger[]{new Passenger("Ann")};

        Car myCar = new Car(engine, driver, passengers);
        System.out.println(myCar);
    }
}
