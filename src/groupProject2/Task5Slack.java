package groupProject2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5Slack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter three ingredients with spaces");
        String ing = input.nextLine();
        System.out.println("Please, enter the int number");
        int number = input.nextInt();

        int space1 = ing.indexOf(" "); //INDEX OF FIRST SPACE
        int space2 = ing.indexOf(" ", space1 +1);

        //String letter1 = ing.substring(0,1);
        //String letter2 = ing.substring(space1 +1, space1 +2);
        //String letter3 = ing.substring(space2 +1 , space2 +2);

        //String word1 = ing.substring(0, space1);
       // String word2 = ing.substring(space1 +1, space2);
       // String word3 = ing.substring (space2+1, ing.length());

        //String firstLetter = "" + word1.charAt(0);
        //String secondLetter = "" + word2.charAt(0);
        //String thirdLetter = "" + word3.charAt(0);

        String convertNumber1 = "" + number;
        String replace1 = convertNumber1 + ing.substring(1,space1);

        number++;
        String convertNumber2 = "" + number;
        String replace2 = convertNumber2 + ing.substring(space1+2,space2);

        number++;
        String convertNumber3 = "" + number;
        String replace3 = convertNumber3 + ing.substring(space2+2, ing.length());

        System.out.println(replace1 + " " + replace2 + "" + " " + replace3);


    }

}
