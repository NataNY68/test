package loops;

import java.util.Scanner;

public class WhilePractice6 {
    public static void main(String[] args) {
        /*
        print out every letter from a given string by separating them by a dash
        television --> t-e-l-e-v-i-s-i-o-n
         */
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the word");
        String word  = name.nextLine();
        int num = 0;
        while(num <= (word.length())-1){
            if (num==word.length()-1){
                System.out.print(word.charAt(num));
            }    else {
                System.out.print(word.charAt(num) + "-");
            }
            num++;
        }
    }
}
