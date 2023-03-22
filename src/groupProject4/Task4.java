package groupProject4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the int number between 1 and 10");
        int num = input.nextInt();

        for (int i = num; i >0 ; i--) {

            for (int j=i; j >0; j--){
                System.out.print(i);
            }
            System.out.println("");
        }

    }
    }

