package ifStatement;

import java.util.Scanner;

public class NastedPractise2 {
    public static void main(String[] args) {
        /*
        TASK

       Ask for a city name of a user
       if the city is --> Chicago OR
       if the city is miami -->? you should be attending miami cambus
       -What is your school name?
       If the school name is Techtorial --> You are lucky to have Efe
       if the school is not techtorial --> please come and visit techtorial
       if the city is not Chicago --> please come to chicago and visit us
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the city you live");
        String city = input.nextLine();



        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("What is your school name");
            String school = input.nextLine();
            if (school.equalsIgnoreCase("techtorial")){
                System.out.println("You are lucky to have Efe");
            } else {
                System.out.println("Please come and visit Techtorial");
            }
        }else if (city.equalsIgnoreCase("miami")){
            System.out.println("you should be attending miami campus");
            System.out.println("What is your school name");
            String school = input.nextLine();
            if (school.equalsIgnoreCase("techtorial")){
                System.out.println("You are lucky to have Efe");
            } else {
                System.out.println("Please come and visit Techtorial");
            }
        }
        else {
            System.out.println("Please come to Chicago and visit us");
        }

        /*do you know java? yes/no

         */
    }
}
