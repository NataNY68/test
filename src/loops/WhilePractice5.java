package loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {
        /*
        get a positive number from user, and create a multiplication table for given number for up to 10
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = scanner.nextInt();
        int a = 1;

        while (a<=10){
            System.out.println(number + "*" + a+ "="+ number*a);
            a++;
        }

    }
}
