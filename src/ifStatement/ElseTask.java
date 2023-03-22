package ifStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a driver license?");
        String ans = input.nextLine();

        if ( ans.equalsIgnoreCase("yes")){
            System.out.println("You are great");
        } else {
            System.out.println("DMV is next door, please visit");
        }

        /*get the amount of purchase from user as Dollar amount
        when the amount is 1000$ or more--> give user 20% discount and show final payment amount after discount
        less than 1000$ --> give user 5% discount and show final payment amount after discount applied
         */



    }
}
