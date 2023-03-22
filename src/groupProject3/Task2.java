package groupProject3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* 2. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        Test Data
        Input number: 3
        Expected Output :
        Wednesday
         */
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter the number from 1 to 7");
        int num = name.nextInt();

        if (num == 1){
            System.out.println("It is Monday");
        } else if (num == 2) {
            System.out.println("It is Tuesday");
        } else if (num ==3) {
            System.out.println("It is Wednesday");
        } else if (num ==4) {
            System.out.println("It is Thursday");
        } else if (num ==5) {
            System.out.println("It is Friday");
        } else if (num ==6) {
            System.out.println("It is Saturday");
        } else if (num ==7) {
            System.out.println("It is Sunday");
        }else {
            System.out.println("Your number have to be from 1 to 7. Try again please");
        }
    }
}
