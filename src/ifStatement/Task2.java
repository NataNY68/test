package ifStatement;

import java.util.Scanner;

public class Task2 {

    /* Get a string from a user, and
    -check if the given string starts with letter 'h' and the length of the string is more than 10
    print  "This is what I am looking for"
     */

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please, enter a text" );
        String str = name.nextLine();


        if (str.startsWith("h") && str.length() > 10){
            System.out.println("This is what I am looking for");

        }

        /* get a single letter from user
        - when the letter from the user is 'M' or 'm'--> it is Monday
        -'T' or 't' --> it is Tuesday
        -'W' or 't' --> it is Wednesday
         */

        System.out.println("Please enter the letter ");
        char letter = name.nextLine().charAt(0);

        if (letter == 'm' || letter == 'M') {
            System.out.println("it is Monday");
        }

        if (letter == 't' || letter == 'T') {
            System.out.println("it is Tuesday");
        }

        if (letter == 'w' || letter == 'W') {
            System.out.println("it is Wednesday");
        }

        //cover the cases when the incoming letters are not one of the  expected

        if (letter != 'm' && letter != 'M' && letter != 't' && letter != 'T'&& letter != 'w' && letter != 'W') {
            System.out.println("Invalid entry");
        }


    }
}
