package groupProject3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        4. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */

        Scanner name = new Scanner(System.in);
        System.out.println("Enter the string value");
        String str = name.nextLine();
        //String first = str.substring(0,1);
        //System.out.println(first);

        char a = str.charAt(0);
        if (a>=97 && a<=122){
        System.out.println(a+ " it is lower case");
        } else if (a>=65 && a<=90) {
            System.out.println(a+ " it is upper case");
        } else {
            System.out.println("invalid enter");
        }

    }
}
