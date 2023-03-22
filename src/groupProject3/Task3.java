package groupProject3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*3. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        If employee has been working more than 10 years, company will give 10% bonus.
        If Employee has more than 15 years, they will get 20% bonus.
        Ask user for their salary and year of service and print the net bonus amount.
        */

        Scanner name = new Scanner(System.in);
        System.out.println("How many years are you working in the company?");
        int time = name.nextInt();
        System.out.println("Please, enter your salary");
        int salary = name.nextInt();

        if (time >5 && time <=10){
            System.out.println("Your bonus is " + salary * 0.05);
            System.out.println("Your total salary is " + (salary + salary*0.05));
        } else if (time >10 && time <=15) {
            System.out.println("Your bonus is " + salary * 0.1);
            System.out.println("Your total salary is " + (salary + salary*0.1));
        } else if (time > 15) {
            System.out.println("Your bonus is " + salary * 0.15);
            System.out.println("Your total salary is " + (salary + salary*0.15));
        }else {
            System.out.println("Your don`t have a bonus yet" );
        }


    }
}
