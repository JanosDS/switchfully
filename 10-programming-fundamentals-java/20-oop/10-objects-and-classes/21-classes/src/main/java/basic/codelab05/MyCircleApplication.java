package basic.codelab05;

import basic.codelab05.shapes.*;

public class MyCircleApplication {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1.toString());

        MyCircle c2 = new MyCircle(8.5);
        System.out.println(c2.toString());
    }
}
