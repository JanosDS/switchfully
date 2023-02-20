package basic.codelab01;

public class Car {
    private Engine engine;
    private Driver driver;
    private Passenger[] passengers;

    public Car(Engine engine, Driver driver, Passenger[] passengers) {
        this.engine = engine;
        this.driver = driver;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        String str = "I am car with " + passengers.length + " passenger(s) (";
        for (Passenger passenger : passengers) {
            str += passenger.getName();
        }
        str += "), a driver called " + driver.getName() + " of " + driver.getAge() + " years old";
        str += " and engine with " + engine.getHorsePower() + " horse-power";
        return str;
    }
}
