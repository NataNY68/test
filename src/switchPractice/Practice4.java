package switchPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please, enter your favorite fruit");
        String fruit = name.nextLine().toUpperCase();

        switch (fruit) {
            case "MANGO" :
            case "APPLE" :
            case "GRAPE" :
            case "BANANA" :
            case "STRAWBERRY" :
                System.out.println("We have your favorite fruit " + fruit );

            default:
                System.out.println("Sorry! we do not have your favorite fruit");


        }
    }
}
