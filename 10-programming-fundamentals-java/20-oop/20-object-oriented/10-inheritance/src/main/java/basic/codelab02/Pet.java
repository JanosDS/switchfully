package basic.codelab02;

public class Pet {
    private String name;
    private double price;
    private boolean isHealthy;

    public Pet(String name, double price, boolean isHealthy) {
        this.name = name;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public boolean buy(double offeredMoney) {
        if (offeredMoney >= price && isHealthy) {
            return true;
        }
        return false;
    }
}
