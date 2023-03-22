package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchStatement {
    /*
    1-Some of the technical questions might have switch instead of if statement to show off yourself that you actually know how to
    implement switch as well

    --> if you have limited amount of options and not change it usually
        then it is good to use switch instead of if to make it look more professional

        SWITCH(VALUE/REFERENCE) --> int number = 5 (here number is reference, and 5 is value)

        case dataType:
        break;
        case dataType:
        break;

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        switch (options){
            default:
                System.out.println("Your input is not in the range 1-3");
                break;
            case 1:
                System.out.println("You are talking with HR");
                break;
            case 2:
                System.out.println("You are talking with IT DEPARTMENT");
                break;
            case 3:
                System.out.println("You are talking with HEALTH DEPARTMENT");
                break;
        }

        List<Object> list = new ArrayList<>();


    }
}
