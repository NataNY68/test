package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How is the weather this morning?");
        String answer = input.nextLine();
        System.out.println(answer);

        //ask user for the name of the day
        //store the name of the day
        //print a message: "So, it is a rainy Sunday"

        System.out.println("What is the name of the day?");
        String day = input.nextLine();
        System.out.println(day);
        //
        // System.out.println("So, it is a " + answer + " "+ day);
        System.out.println("\"So, it is a "+answer +" "+day +"!\"");

        //next() -- will take a String till first space
        System.out.println("Which city is this?");
        String city = input.next();
        System.out.println("So, it is a "+answer +" "+day + " in " + city);

        // what is the zip code? store it, and double check with user by printing back

        System.out.println("What is your zip code");
        int zip1 = input.nextInt();
        System.out.println(zip1);
        System.out.println("So, is correct zip code ?" + zip1);
        System.out.println(zip1 + 100);


    }
}
