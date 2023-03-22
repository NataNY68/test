package loops;

import java.io.FilterOutputStream;

public class ForPractice1 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 5;

//        while (num1 < num2) {
//            System.out.println(num1);
//            num1++;
//        }

        for (  ; num1<num2; num1++){
            System.out.println(num1);
        }

        for ( int number1 = 10, number2 = 20 ;  number2 > number1 ; number2-- ){
            System.out.println("Number now " + number2);
        }

        int i = 0;
        for (; i <10;  i++){
            System.out.println(i+1 + ". I like for loop");

            System.out.println(i);
        }

        System.out.println("=================");
        System.out.println(i);



        //=======================

        for (int a =0 ; a<5 ; a++){
            System.out.println("before break time");
        }

        // infinite for loop

//        for (; ;){
//            System.out.println("after break");
//        }

        int a=5;
        for (String str = "example" ; a<8 ; a++){
            System.out.println(str);
        }


    }
}
