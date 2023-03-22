package groupProject3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the int number");
        int num = input.nextInt();

        if (num%2 ==0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }

    }
}
