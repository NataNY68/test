package groupProject3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = name.nextInt();

        if (year % 4 ==0 && !(year % 100 ==0)){
            System.out.println("leap year");
        }else if (year % 400 ==0  ){
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }

    }
}
