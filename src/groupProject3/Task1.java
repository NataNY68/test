package groupProject3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*1. Take three numbers from the user and print the greatest number.
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();

        System.out.println("Please enter the second number");
        int num2 = input.nextInt();

        System.out.println("Please enter the third number");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The greatest number: " + num1);
        } else if (num2 >num1 && num2 > num3) {
            System.out.println("The greatest number: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The greatest number: " + num3);
        }


    }
}
