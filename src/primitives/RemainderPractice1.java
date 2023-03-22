package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        //REMAINDER % - modulus or remainder operator will find left over from a division question

        int number1 = 17, number2 = 5;
        int r1 = number1 % number2;

        System.out.println(r1 + " is the left over from dividing " + number1 + " and " + number2);

        int number3 = 123;
        //find the reminder of 123 divided by ten

        int r2 = number3 % 10;

        System.out.println(r2);
        System.out.println(number3/10); //12
        System.out.println(number3 % 100); //23

        System.out.println(21 % 10); //1
        System.out.println(3214 % 10); //4
        System.out.println(2007 % 10); //7

        /*  123 --> sum of digits number 1+2+3 = 6
         */


    }
}
