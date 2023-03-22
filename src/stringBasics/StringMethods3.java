package stringBasics;

import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        String str = "water";

        //startsWith(); --> returns boolean

        boolean result1 = str.startsWith("w");
        System.out.println(result1);//true
        System.out.println(str.startsWith("water"));//true
        System.out.println(str.startsWith("ter"));//false

        //endsWith(); returns boolean

        System.out.println(str.endsWith("r")); //true
        System.out.println(str.endsWith("abc")); //false

        /*TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- lenght of string
	- index of x
	- middle char
         */

        System.out.println("Please, write a word");
        String word = name.nextLine();
        char first = word.charAt(0); //first char
        System.out.println("First char is " + first);
        int length1 = word.length(); //length of word
        System.out.println("Length of the word " + length1);
        char last = word.charAt(length1 -1);// last character
        System.out.println("Last char is " + last);
        int secondC = word.indexOf('c', word.indexOf('c')+1); //index of second 'c'
        System.out.println("Index of second 'c' is " + secondC);
        int indexOfX = word.indexOf('x'); // index of letter 'x'
        System.out.println("Index of letter 'x' " + indexOfX);
        char middle = word.charAt(length1/2); //middle char
        System.out.println("Middle char is " + middle);

        //contains(); --> boolean

        str = "water";
        boolean b = str.contains("w");
        boolean b1 = str.contains("ter");

        System.out.println(b);//true
        System.out.println(b1);//true
        System.out.println(str.contains("ta"));//false

        System.out.println(str.startsWith("wat")  != str.contains("ter")); // false
        System.out.println((str.startsWith("wat")  != str.contains("ter")) && true); //false

        //equals(); --> return boolean

        System.out.println(str.equals("Water")); //false
        System.out.println(str.equals("WATER")); //false
        System.out.println(str.equals("water")); //true

        str = str.toUpperCase();

        System.out.println(str.toUpperCase());
        System.out.println(str.equals("WATER"));//true

        //equalsIgnoreCase(); ---> boolean

        System.out.println(str.equalsIgnoreCase("WaTeR")); //true
        System.out.println(str.equalsIgnoreCase("ater")); //false







    }
}
