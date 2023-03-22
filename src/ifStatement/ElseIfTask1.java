package ifStatement;

import java.util.Scanner;

public class ElseIfTask1 {
    public static void main(String[] args) {

        /* get an int number from user
         check and print out if the given number is positive number, negative or zero
          */
        Scanner input = new Scanner(System.in);
        System.out.println("Print an integer number");
        int number = input.nextInt();

        if (number<0) {
            System.out.println("It is negative number");
        }else if (number == 0) {
            System.out.println("It is zero");
        } else {
            System.out.println("it is positive number");
        }

    }
}
