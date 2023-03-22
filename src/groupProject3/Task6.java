package groupProject3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height?");
        int height = input.nextInt();
        int age = 0;

        if (height >= 120){
            System.out.println("What is your age?");
            age = input.nextInt();

            if (age>= 9){
                System.out.println("Welcome aboard");

                if (age >=9 && age <18){
                    System.out.println("Your ticket costs 7$");
                } else if (age >=18) {
                    System.out.println("Your ticket price is 12$");
                }

            }else {
                System.out.println("Sorry, you are not eligible to ride you are too young");
            }

        }else {
            System.out.println("Sorry, you are not eligible to ride, you have to be at least 120 cm ");
        }

    }
}
