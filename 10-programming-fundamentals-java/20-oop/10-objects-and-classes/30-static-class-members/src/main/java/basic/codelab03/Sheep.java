package basic.codelab03;

import java.awt.*;

public class Sheep {

    public static int SHEEP_COUNT = 0;
    public static final String BANNED_NAME = "Dolly";
    private String nickname;
    private double price;
    private Color color;

    public Sheep(String nickname, double price, Color color) {
        setNickname(nickname);
        this.price = price;
        setColor(color);
        SHEEP_COUNT++;
    }

    public void setColor(Color color) {
        if (validateColor(color)) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color needs to be white or black");
        }
    }

    public void setNickname(String nickname) {
        if (validateNickname(nickname)) {
            this.nickname = nickname;
        } else {
            throw new IllegalArgumentException("Nickname can't be Dolly.");
        }
    }

    public double getPrice() {
        return price;
    }

    public boolean validateNickname(String nickname) {
        if (nickname.equalsIgnoreCase(BANNED_NAME)) {
            return false;
        }
        return true;
    }

    public boolean validateColor(Color color) {
        if (color == Color.black || color == Color.white) {
            return true;
        }
        return false;
    }

    public static int amountOfActiveSheep() {
        return SHEEP_COUNT;
    }

    @Override
    public String toString() {
        String str = "I'm a sheep named " + this.nickname + " (which is not Dolly) and I'm";
        if (this.color == Color.white) {
            str += " white";
        } else {
            str += " not white";
        }
        return str;
    }
}
