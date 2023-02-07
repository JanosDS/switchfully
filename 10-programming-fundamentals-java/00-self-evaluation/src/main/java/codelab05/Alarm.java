package codelab05;

import java.util.Arrays;

public class Alarm {
    String sound = "Beep";

    public Alarm(){
    }
    public Alarm(String sound){
        setSound(sound);
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String[] makeSound(){
        return makeSound(3);
    }
    public String[] makeSound(int x){
        String[] soundToMake = new String[x];
        Arrays.fill(soundToMake, this.sound);
        return soundToMake;
    }
}
