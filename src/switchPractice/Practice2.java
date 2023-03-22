package switchPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*get an int number from user
        if the number is 1 --> it is IT Department
                         2 --> It is HR Department
                         3 --> It is Help Desk
                         4 --> It is Accounting
                         cover for invalid choices
         */
        Scanner name = new Scanner(System.in);
        System.out.println("please, enter an int number");
        int number = name.nextInt();

        switch (number){
            case 1 :
                System.out.println("it is IT Department");
                break;
            case 2 :
                System.out.println("It is HR Department");
                break;
            case 3:
                System.out.println("It is Help Desk");
                break;
            case 4 :
                System.out.println("It is Accounting");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }


    }
}
