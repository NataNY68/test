package groupProject4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the int number between 1 and 10");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j=1; j <= i; j++){
            System.out.print(i);}
            System.out.println("");

        }

    }
}


