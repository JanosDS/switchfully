package basic.codelab01;

import java.awt.*;

public class CarShopApplication {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop.getCar("1").toString());
        System.out.println(shop.getCar("2").toString());
    }
}
