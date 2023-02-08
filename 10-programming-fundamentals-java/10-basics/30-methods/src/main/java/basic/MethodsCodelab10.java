package basic;

public class MethodsCodelab10 {

    public static void main(String[] args) {

        //--------
        // Try to remove the duplication of this code

//        System.out.println("Earth revolves around the sun");
//        System.out.println("Mars revolves around the sun");
//        System.out.println("Mercury revolves around the sun");
//        System.out.println("Venus revolves around the sun");

        revolvesSun("Earth");
        revolvesSun("Mars");
        revolvesSun("Mercury");
        revolvesSun("Venus");
    }

    public static void revolvesSun(String object){
        System.out.println(object + " revolves around the sun.");
    }
}
