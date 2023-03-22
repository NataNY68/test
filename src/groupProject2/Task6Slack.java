package groupProject2;

import java.util.Scanner;

public class Task6Slack {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter the String value");
        String value = name.nextLine();

        System.out.println("Please enter the starting number");
        int num1 = name.nextInt();

        System.out.println("Please enter the ending number");
        int num2 = name.nextInt();

        String newValue = value.substring(num1-1, num2);
        System.out.println(newValue);

    }
}
