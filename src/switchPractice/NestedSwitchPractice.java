package switchPractice;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
                /*get an int number from user
        if the number is 1 --> it is IT Department
                               - John
                               - Marry
                         2 --> It is Accounting
                                - Jake
                                -Bill
                         3 --> It is HR
                                - Anna
                                - Diana
                                - Mike

                         4 --> It is Help Desk
                                - Efe

                         cover for invalid choices
                         Please
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from the following department by pressing related number: " +
                "\n1 - IT \n2 - Accounting \n3 - HR \n4 - Help Desk");
        int department = input.nextInt();

        switch (department) {
            case 1:
                System.out.println("You reached to the IT department, choose who you want to speak with" +
                        " John / Marry");
                input.nextLine();
                String name = input.nextLine();
                name = name.toLowerCase();
                switch (name) {
                    case "john":
                    case "marry":
                        System.out.println("You are speaking with " + name);
                        break;
                    default:
                        System.out.println("There is no such a person like " + name);
                }
                break;
            case 2:
                System.out.println("You reached to the Accounting department, choose who you want to speak with:" +
                        "Jake / Bill");
                input.nextLine();
                String name1 = input.nextLine();
                name1 = name1.toLowerCase();
                switch (name1) {

                    case "bill":
                    case "jake":
                        System.out.println("You are speaking with " + name1);
                        break;
                    default:
                        System.out.println("There is no such a person like " + name1);
                }
                break;
            case 3:
                System.out.println("You reached to the HR department, choose who you want to speak with:" +
                        "Anna / Diana / Mike");
                input.nextLine();
                String name2 = input.nextLine();
                name1 = name2.toLowerCase();
                switch (name1) {

                    case "anna":
                    case "diana":
                    case "mike":
                        System.out.println("You are speaking with " + name2);
                        break;
                    default:
                        System.out.println("There is no such a person like " + name2);break;
                }
                break;
            case 4:
                System.out.println("You reached to the Help Desk, you are speaking with Efe");
                break;
            default:
                System.out.println("There is no matching department for your entry");
                break;

        }
    }
}

