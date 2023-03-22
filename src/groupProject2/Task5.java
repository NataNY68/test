package groupProject2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Input number x, please");
        int x = name.nextInt();

        System.out.println("Input number y, please");
        int y = name.nextInt();

        int x1 = y;
        int y1 = x;

        System.out.println("x = " + x1 + ", y = " + x);

    }
}
