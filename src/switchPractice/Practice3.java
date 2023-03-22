package switchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask the user for the favorite fruit
        - strawberry, mango, apple, grape, banana

        "We have your favorite fruit ..."
        "Sorry! We do not have your favorite fruit "
         */

        Scanner name = new Scanner(System.in);
        System.out.println("What is your favorite fruit?");
        String fruit = name.nextLine().toLowerCase();

        switch (fruit) {

            case "strawberry":
                System.out.println("We have your favorite fruit" + fruit);
            case "mango":
                    System.out.println("We have your favorite fruit" + fruit);
                    break;

                    case "apple":
                        System.out.println("We have your favorite fruit" + fruit);
                        break;

                        case "grape":
                            System.out.println("We have your favorite fruit" + fruit);
                            break;

                            case "banana":
                                System.out.println("We have your favorite fruit" + fruit);
                                break;

                                default:
                                    System.out.println("Sorry! We do not have your favorite fruit");
                                }
                            }

                        }

