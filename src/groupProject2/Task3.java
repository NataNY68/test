package groupProject2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write one sentence with three words");

        String answer = input.nextLine();//Importance of human
        System.out.println(answer);

        int a = answer.indexOf(" "); //index of first space = 10

        System.out.println(a-1); // index of letter before first space (letter "e")
        System.out.println(a-1 + " --> index number of '" + answer.charAt(a-1)+ "'"); //sout letter e

        int b = answer.indexOf(" ", a+1);
        System.out.println(b-1); //index of letter before second space (letter "f")
        System.out.println(b-1 + " --> index number of '" + answer.charAt(b-1) + "'");

        int c = answer.length();
        System.out.println(c-1);//index of last letter of third word
        System.out.println(c-1 + " --> index number of '" + answer.charAt(c-1) + "'");

        int sum = (a-1) + (b-1) + (c-1);
        System.out.println("The sum is "+ sum);






    }

}
