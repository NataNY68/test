package loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        //get a positive number from user
        //for that given number, create a star tree like following
        //--> user enters 5
        /*
        *
        **
        ***
        ****
        *****
         */

        Scanner name = new Scanner(System.in);
        System.out.println("Enter int positive number");
        int num = name.nextInt();
        int num1 = 1;
        String str = "*";

        do {
            System.out.println(str);
            num1++;
            str =str.concat("*");
        }while (num1<=num );

        do {
            System.out.println(str);
            str = str.concat("*");
            num--;
        }while (num > 0);

    }
}
