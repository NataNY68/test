package groupProject4;

import java.util.Scanner;

public class Task7a {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Please enter 3   numbers");
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int num3 = n.nextInt();
        for(int i = 1; i<=4; i++) {
            if (num1 % 10 == i || num2 % 10 == i|| num3 % 10 ==i) {
                num1 -= num1%10;//11
                num2 -= num2%10;
                num3 -= num3%10;
            }
        }
        for(int i = 1; i<=5; i++) {
            if (num1 % 10 == i || num2 % 10 == i|| num3 % 10 ==i) {
                num1 -= num1%10 +10;
                num2 -= num2%10 + 10;
                num3 -= num3%10 +10;
            }
        }
        System.out.println(num1+num2+num3);
    }
}
