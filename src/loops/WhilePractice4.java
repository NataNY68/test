package loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/user have 100$
        ask user how much is the spending amount
        -if the spending amount is less than balance keep asking user and let him /her
        to spend more.
        -if the spending amount is greater than the balance --> you do not have enough money to spend!
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your spending amount?");
        int amount = input.nextInt();
        int balance = 100;

        while (amount <= balance){
            int leftMoney = balance - amount;
            System.out.println("You have " + leftMoney + " left. How much is the spending amount?");
            balance = leftMoney;
            amount = input.nextInt();
        }
        System.out.println("You don't have enough money");

       // while (balance >0) {
           // balance = balance - amount;
          //  System.out.println("You have " + balance + "$. "+" What is your spending amount?");
           // amount = input.nextInt();

           // if (amount > balance ) {
         // System.out.println("You don`t have enough money to spend!");

           // }else {
             //   System.out.println("You don`t have enough money to spend!");
            }

        }


