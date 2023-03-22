package groupProject4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one String value");
        String text = input.nextLine().trim().toLowerCase();
        String box = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                box += text.charAt(i);
            } else if (!box.contains("" + text.charAt(i))){
                box += text.charAt(i);
            }

        }
        System.out.print(box);




    }

    }

