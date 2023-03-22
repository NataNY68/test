package my;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();
        // Please don't change anything on lines above.

        int space1 = threeWords.indexOf(" ");
        int space2 = threeWords.indexOf(" ", space1+1);

        String first = threeWords.substring(0, space1);
        System.out.println(first);

        String second = threeWords.substring(space1 +1, space2);
        System.out.println(second);

        String third = threeWords.substring(space2+1, threeWords.length());
        System.out.println(third);

        char ch1= first.charAt(0);
        System.out.println(ch1);
        char ch2= second.charAt(0);
        System.out.println(ch2);
        char ch3= third.charAt(0);
        System.out.println(ch3);

        String lastletter1 = first.substring(space1-1, space1);
        System.out.println(lastletter1);

        String lastletter2 = second.substring(space2-1, space2);
        System.out.println(lastletter1);

        String lastletter3 = third.substring(third.length()-1, third.length()-2);
        // System.out.println(lastletter1.concat(lastletter2).concat(lastletter3));

    }
}
