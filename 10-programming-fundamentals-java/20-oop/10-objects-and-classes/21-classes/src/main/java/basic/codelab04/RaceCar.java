package basic.codelab04;

public class RaceCar {
    private int numberOfGears;
    private int currentGear;

    public RaceCar() {
        this.numberOfGears = 6;
        this.currentGear = 0;
    }

    public RaceCar(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        setCurrentGear(currentGear);
    }

    private void setCurrentGear(int gear) {
        if (gear < 0) {
            currentGear = 0;
        } else if (gear > numberOfGears) {
            currentGear = numberOfGears;
        } else {
            this.currentGear = gear;
        }
    }

    public void shiftGearUp() {
        setCurrentGear(currentGear + 1);
    }

    public void shiftGearDown() {
        setCurrentGear(currentGear - 1);
    }

    public void shiftGear(int gear) {
        if (currentGear + 1 == gear || currentGear - 1 == gear) {
            setCurrentGear(gear);
        }
    }

    @Override
    public String toString() {
        return "Racecar with " + numberOfGears + " in total, currently in " + currentGear + " gear.";
    }
}
