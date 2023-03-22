package RecapWithAhmet;

import java.util.SortedMap;

public class JavaPrimitiveDateAsciiTable {
    /*
    Possible interview questions
    1- What is Java? And what do you know about JDK, JVM, JRE?

    Java: is a programming language. To make a connection between aa computer and people.

    JDK: Java Development Kit that has some libraries which support the 'application development'.
    JRE: Java Runtime Environment which is responsible for 'EXECUTION'.
    JVM: Java Virtual Machine --> is a virtual machine which is responsible for 'converting the BYTE code to BINARY code(0,1)'.

    PRIMITIVE DATA: It a way to store the data in it, no methods. It does not take up too much space in.

    WHOLE  NUMBERS            DECIMAL NUMBERS        CONDITION         CHARACTER
    -> byte                    -> float               -> boolean        -> char
    -> short                   -> double ***
    -> int ****
    -> long *

    ASCII TABLE: It is a table for all the character(alphabet, digits, symbols, etc,..)

    short a =5;
    short b=6;
    short c = (a+b-2);
    sout(c)
     */
    public static void main(String[] args) {
        short a =5;
        short b=6;
        short c = (short)(a+b-2);
        System.out.println(c); //9

        char letter = 65;
        char letter2 = 'g';
        int number = 'g';
        System.out.println(number); //103
        System.out.println(letter2-letter); //103 - 65 = 38
        System.out.println(letter2); // g
        System.out.println(letter);//A

        int number1 =5;
        int number2 = 21;
        boolean condition1 = number1>number2;
        boolean condition2 = number2>number1;
        System.out.println(condition2); //true
        System.out.println(condition1); //false

        double amount = 24.5d;
        double amount2 = 0.346775432;
        System.out.println(amount2);
        System.out.println(amount);

        /*
        int AllAmount = amount + amount2;
        sout ()
         */

        double AllAmount = amount + amount2;
        System.out.println(AllAmount);

    }

}
