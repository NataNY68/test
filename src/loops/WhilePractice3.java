package loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /* get a number from the user and find the divisor of the given number
        10 --> 1,2,5, 10
        15 --> 1, 3, 5, 15
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number");
        int number = input.nextInt();
        int divisor = 1;

        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.println("The divisor is " + divisor);
            }
            divisor++;
        }
    }
}