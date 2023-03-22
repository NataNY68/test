package ternary;

public class Practice1 {
    public static void main(String[] args) {

        //boolean condition      ?     value1    :   value;

        int a = 16, b = 7;

      int result =  a < b  ?  a + b  :   a * b;
        System.out.println(result); //13

      String result1 =  a != b  ? "Addition"  :  "Multiplication";
        System.out.println(result1);

        System.out.println(a >= b + 9     ?   'c'  :   "check"); //since data types of options are different
                                                                 // you cannot store it

        String str1 = "I am so lucky";
        String str2 = "It is going great";
        String day = "Sunday";

        System.out.println(        day.equals("Monday")  ? str2 : str1);

        System.out.println("a --> "+a + "  b --> " + b);
        System.out.println(  a > b  ?  ++a + ++b  : --a + --b   );
        System.out.println("a --> "+a + "  b --> " + b);

        ////////NESTED TERNARY

        //a > b  ?  ++a + ++b  : --a + --b

        // day.equals("Monday")  ? str2 : str1

        System.out.println(day.equals("Monday")  ? str2 : a > b  ?  ++a + ++b  : --a + --b);



    }
}
