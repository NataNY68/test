package ifStatement;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*get the amount of purchase from user as Dollar amount
        when the amount is 1000$ or more--> give user 20% discount and show final payment amount after discount
        less than 1000$ --> give user 5% discount and show final payment amount after discount applied

        charge some tax
        if the shopping is happening in the state of TX
        charge 4.5% tax and add it to the final payment
         */
        System.out.println("Enter the amount of purchase in dollar ");
        double amount = input.nextDouble();
        input.nextLine();
        System.out.println("Which state do you live? ");
        String state = input.nextLine();
        double tax = 0, txTax = 0.045;

        if (state.equalsIgnoreCase("tx") || state.equalsIgnoreCase("texas")){
            tax = amount*txTax;
            System.out.println("Your final amount with taxes " + amount);
        }else {
            tax = amount*0.1;
        }

        if (amount >= 1000) {
            double discount1 = amount* 0.2;
            amount = (amount - discount1) + tax;

            System.out.println("Your savings is " + discount1);
            System.out.println("You have 20% discount! " + "Your final payment is " + amount);

        } else {
            double discount2 = amount*0.05;
            amount = (amount - discount2) + tax;
            System.out.println("Your savings is " + discount2);

            System.out.println("You have 5% discount! " + "Your final payment is " + amount);
        }

    }
}
