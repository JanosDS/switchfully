package basic.codelab03;

public class OrderService {

    public static final double ORDER_FEE = 5;

    public double orderSheep(Sheep sheep) {
        return sheep.getPrice() + ORDER_FEE;
    }

    public String orderFeeAsText() {
        return "The order fee is " + ORDER_FEE;
    }

}
