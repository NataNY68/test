package ifStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Ask user to give you an integer number between 1 and 5 included, and
-print out day name for related number
input --> 1 --> Monday
      --> 2 --> Tuesday
      --> 3 --> Wednesday
        */

        Scanner name = new Scanner(System.in);
        System.out.println("Please, write an int number between 1 and 5 included ");
        int number = name.nextInt();

        if (number == 1){
            System.out.println("Monday");
        }

        if(number == 2){
            System.out.println("Tuesday");
        }

        if(number == 3){
            System.out.println("Wednesday");
        }

        if(number == 4){
            System.out.println("Thursday");
        }

        if(number == 5){
            System.out.println("Friday");
        }
        if(number > 5 || number < 1){
            System.out.println("There is no matching day for your entry");
        }

        System.out.println("Please, enter a text" );
        name.nextLine();
        String str = name.nextLine();


        if (str.startsWith("h") && str.length() > 10){
            System.out.println("This is what I am looking for");

        }
    }
}
