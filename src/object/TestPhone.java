package object;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What shape of phone are you looking");
        String answer = scanner.next();

        Phone firstPhone = new Phone(answer, "Blue", 799, true);
        System.out.println( "rectangle".equalsIgnoreCase(firstPhone.shape) );
        firstPhone.call(1234567890);

        //create a method that will check price of the phone
        // if the price is under my budget, I will buy it

        double budget = 1000;
        System.out.println(budget > firstPhone.price);

        priceCheck(firstPhone, budget);

      Phone secondPhone = new Phone("d", "black", 12, false);
        System.out.println(secondPhone.color);
    }

    public static void priceCheck(Phone phone1, double limit){
        if (phone1.price<limit){
            System.out.println("this is in your budget: " + phone1.color);
        }
        System.out.println();


    }

}
