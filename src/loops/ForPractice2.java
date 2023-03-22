package loops;

public class ForPractice2 {
    public static void main(String[] args) {
        // find the sum of number between 10 and 15 by using for loop

        int sum = 0;
        for (int num1 = 10, num2 = 15; num1 <= num2; num1++) {
            sum += num1;
        }
        System.out.println("sum is " + sum);

        //String str = "Today is beautiful";
        //print out every letter from this given string separately by comma
        String str = "Today is beautiful";
        int num = 0;

        for (char ch = str.charAt(num); num < str.length(); num++) {

            if (num == str.length() - 1) {
                System.out.print(str.charAt(num));
            } else {
                System.out.print(str.charAt(num) + ", ");
            }
        }
        System.out.println();

        //print above style without spaces --> get rid of the spaces and print letter with dash

        str = "Today is beautiful";
        str = str.replace(" ", "");


        for ( int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i) + "-");
            }
        }
        System.out.println("=============");

        str = "Today is beautiful";

        for ( int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 && str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i) + "-");

        }
        }



    }
}
