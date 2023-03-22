package primitives;

public class ArithmeticPractice {

    public static void main(String[] args) {
        // ADDITION +
        int num1 = 10, num2 = num1 + 5;
        int result1 = num1 + num2;

        System.out.println(result1);

        //SUBTRACTION -
        double result2 = num2 - num1; // 5
        System.out.println(result2); //5.0

        int result3 = 7-3;
        System.out.println(result3);

        // MULTIPLICATION *
        int count1 = 2;
        int count2 = 5;

        System.out.println(count1 * count2 );

        int result4 = count1 * count2; //10
        System.out.println(result4); //10

        System.out.println(result4 == (count1 * count2)  ); // true
        System.out.println( (result4 + 10 + result4) == (count1 + count2)); // false

        //DIVISION '/'
        int result5 = count2 / count1;
        System.out.println(result5); //2

        double result6 = count2 / count1; // since count1 and count2 are created as int, the result of divison
        // will be as int (no fractional part)
        System.out.println(result6); //2.0

        double number1 = 11;
        double number2 = 2;
        double divide = number1 / number2; // count1 and count2 are created as double
        System.out.println(divide); //5.5

        //REMINDER %












    }
}
