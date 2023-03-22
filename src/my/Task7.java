package my;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = "";
        int i = 0;

        for (; i <str.length(); i++){
            a+="a";
            System.out.println(a+str.substring(i+1));

        }

    }
}
