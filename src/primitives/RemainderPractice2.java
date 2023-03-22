package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        /*  123 --> sum of digits number 1+2+3 = 6
         */
        int number = 123;
        System.out.println("number is " + number);
        int digit1 = number % 10;
        System.out.println("digit1 is " + digit1);

        //12
        number = number /10;
        System.out.println("Number is now " +number );
        int digit2 = number % 10;
        System.out.println("digit2 is " + digit2);

        //1
        number = number / 10;
        System.out.println("Number is now " + number);
        int sum = digit1 + digit2 + number;
        System.out.println("the sum of the digits is " + sum);



    }
}
