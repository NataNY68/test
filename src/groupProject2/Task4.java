package groupProject2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int firstN = input.nextInt();

        System.out.println("Input second number");
        int secondN = input.nextInt();

        int result = secondN * firstN;
        System.out.println(secondN + " * " + firstN + " = " + result);
    }
}
