package scannerPractice;

import java.util.Scanner;

public class Paycheck {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        double balance = 200;
        /*
        System.out.println("Please, enter first deposit amount");
        double paycheck1 = name.nextDouble();
        balance += paycheck1;

        System.out.println("Please, enter second deposit amount");
        double paycheck2 = name.nextDouble();
        balance += paycheck2;

        System.out.println("Please, enter third deposit amount");
        double paycheck3 = name.nextDouble();
        balance += paycheck3;

        System.out.println("Your balance after deposit is " + balance);

        System.out.println("Please enter phone price");
        double phone$ = name.nextDouble();
        balance -= phone$;
        System.out.println("Please enter headphone price");
        double headphone$ = name.nextDouble();
        balance -= headphone$;

        System.out.println("After buying some items your balance is " + balance);
        */
        System.out.println("First paycheck");
        double paycheck1 = name.nextDouble();
        System.out.println("Second paycheck");
        double paycheck2 = name.nextDouble();
        System.out.println("Third paycheck");
        double paycheck3 = name.nextDouble();
        double total = balance + paycheck1 + paycheck2 + paycheck3;

        System.out.println("Total amount on bank account is " + total);

        System.out.println("Price for the phone is " );
        double phone = name.nextDouble();
        System.out.println("Price for the headphones is " );
        double headphone = name.nextDouble();

        double c = (total - paycheck2 - paycheck1 - paycheck3);
        System.out.println("The final money on his bank account is " + (total - paycheck2 - paycheck1 - paycheck3));



    }
}
