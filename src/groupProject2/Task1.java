package groupProject2;

public class Task1 {
    public static void main(String[] args) {
        int number = 578432;
        int a6 = number % 10; // number6 = 2

        int b1  = number/10; //57843
        int a5 = b1 % 10; //number5 = 3

        int b2 = b1/10; //5784
        int a4 = b2 % 10; //number4 = 4

        int b3 = b2 / 10; //578
        int a3 = b3 % 10; // number3 = 8

        int b4 = b3 / 10; // 57
        int a2 = b4 % 10; // number2 = 7

        int b5 = b4 / 10; //5
        int a1 = b5 % 10; //number1 = 5

        int product = a1 * a2 * a3 * a4 * a5 *a6;
        System.out.println("Multiplication of all digits is " + product);

        int sum = a1 + a2 + a3 + a4 + a5 + a6;
        System.out.println("Sum of all digits is " + sum);

        int k = 2;
        k++;
        int i = k++ + ++k;
        System.out.println(i);

        long L1 = 4, L2, L3 = 7;
        System.out.println(L3);

        int a = 12;
        double b = 15;


    }
}
