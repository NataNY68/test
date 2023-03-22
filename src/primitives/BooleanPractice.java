package primitives;

public class BooleanPractice {
    public static void main(String[] args) {

        boolean isCold = true;
        boolean isBreak;
        isBreak = false;
        isCold = false;
        System.out.println(isCold); // false
        System.out.println(isBreak); // false

       // boolean isStudyinf = "yes";  --> you  can`t assign yes or no to boolean data type (compile time error)

        // 2 = 2 --> yes
        boolean result1 = 2 == 2;
        System.out.println(" >>>> "+ result1); // true

        boolean result2 = 2 == 3;
        System.out.println(result2); // shows false
        System.out.println("=============================");

        // ! -->makes the boolean the boolean value to opposite (true <-->)

        boolean isLightOn = true;
        System.out.println(isLightOn);//shows true
        System.out.println(!isLightOn); // shows false
        System.out.println(isLightOn); // shows true

        isLightOn = !isLightOn;
        System.out.println(isLightOn); // shows false






    }
}
