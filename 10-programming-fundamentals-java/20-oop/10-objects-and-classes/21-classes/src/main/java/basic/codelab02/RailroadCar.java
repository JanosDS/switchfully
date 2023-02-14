package basic.codelab02;

public class RailroadCar {
    private String serialNumber;
    private boolean isFirstClass;
    private int numberOfSeats;
    private boolean hasToilet;

    public RailroadCar(String serialNumber) {
        this.serialNumber = serialNumber;
        this.isFirstClass = false;
        this.numberOfSeats = 100;
        this.hasToilet = false;
    }

    public RailroadCar(String serialNumber, boolean isFirstClass, int numberOfSeats, boolean hasToilet) {
        this.serialNumber = serialNumber;
        this.isFirstClass = isFirstClass;
        this.numberOfSeats = numberOfSeats;
        this.hasToilet = hasToilet;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isHasToilet() {
        return hasToilet;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }

    public void toggleToilet() {
        hasToilet = !hasToilet;
    }

    @Override
    public String toString() {
        return "RailroadCar " + serialNumber + ": Number of seats: " + numberOfSeats + " - First class: " + isFirstClass + " - Has a toilet: " + hasToilet;
    }
}
