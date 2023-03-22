package loops;

import java.util.EventListener;

public class ForPractice4 {
    public static void main(String[] args) {
        //print out alphabet as uppercase letters
        for (char char1 = 'A'; char1 <='Z'  ;  char1++) {
            if (char1 == 'Z') {
                System.out.print(char1);
            }else {
                System.out.print(char1 + ", ");
            }
        }
        System.out.println();
        System.out.println("--------------------");

        //print out digits by separating them with $
        for (char n1 = '0'; n1<='9'  ; n1++) {
            if (n1 == '9') {
                System.out.print(n1);
            }else {
                System.out.print(n1 + "-$$$-");
            }
        }


    }
}
