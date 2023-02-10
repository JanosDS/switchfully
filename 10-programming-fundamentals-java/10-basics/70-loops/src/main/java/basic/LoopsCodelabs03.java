package basic;

public class LoopsCodelabs03 {


    /*
     * This code will wish someone a happy birthday by saying "Hip Hip Hooray" for every year they are old.
     *
     * Remove the duplication in this code using loops and methods.
     */
    public static void main(String[] args) {
        singHappyBirthday("Sophie", 10);
        singHappyBirthday("Jef", 7);
    }

    private static void singHappyBirthday(String name, int age){
        System.out.println("Happy Birthday " + name +"!");
        System.out.println("You're today " + age +" years old!");
        hipHipHooray(age);
    }
    private static void hipHipHooray(int amount){
        for(int i = 0; i < amount; i++){
            System.out.println("Hip Hip Hooray!");
        }
    }
}
