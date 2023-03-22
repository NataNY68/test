package ifStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        int money = 100;

        //if your money is more than $100 you can get an item

        if (money > 100){
            System.out.println("I can buy an item");
        } else {
            System.out.println("I can not buy an item");
        }

        money = 101;

        if (money > 100) {
            System.out.println("I can buy");
        } else {
            System.out.println("I can not buy");
        }

        /* ask user if they have driver`s lisence.
        if the answer is 'yes' --> you are great
        if the answer is smth else --> ""DMV is next door, please visit
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a driver license?");
        String ans = input.nextLine();

        if ( ans.equals("Yes") || ans.equals("YES") || ans.equals("yes")){
            System.out.println("You are great");
        } else {
            System.out.println("DMV is next door, please visit");
        }


    }
}
