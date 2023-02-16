package basic.codelab02;

public class Cat extends Pet {

    private boolean isAggresive;

    public Cat(String name, double price, boolean isHealthy) {
        super(name, price, isHealthy);
        this.isAggresive = false;
    }

    public void makeAggresive() {
        this.isAggresive = true;
    }

    @Override
    public boolean buy(double offeredMoney) {
        if (super.buy(offeredMoney) && !isAggresive) {
            return true;
        }
        return false;
    }
}
