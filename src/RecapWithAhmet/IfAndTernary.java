package RecapWithAhmet;

import java.util.Scanner;

public class IfAndTernary {
    /*
    POSSIBLY INTERVIEW QUESTION:
    1-Most of technical question are required if condition

    IF - is a conditional statement
    if(condition){                      if(condition){ implementation }
      implementation                       else if(condition){implementation}
    }else {                                 else {implementation}
       implementation
    }


    TERNARY OPERATORS :
    CONDITIONS  ?  VALUE1 : VALUE2;  // Condition TRUE -> VALUE1, FALSE -> VALUE2;



     */
    public static void main(String[] args) {
        /*
        -10 to 0 --> super cold
        0 to 25 --> normal
        25 to 50 --> hot
         */
        Scanner scanner = new Scanner(System.in);
        int actualTemperature = scanner.nextInt();

        if(actualTemperature<0 &&actualTemperature > -10){
            System.out.println("it is super cold");
        } else if (actualTemperature<25 && actualTemperature > 0) {
            System.out.println("it is normal");
        } else if (actualTemperature<50 && actualTemperature>25) {
            System.out.println("it is hot");
        }else {
            System.out.println("the input is not correct for condition, please check");
        }

        boolean result = actualTemperature >10 || actualTemperature < 5;
        System.out.println(result);


        String name = "Ahnet";
        String name2 = "ahmet";
        String result2 = name.equalsIgnoreCase(name2)  ?  "The value are is matching"  : "The value is not matching";
        System.out.println(result2);


    }

}
