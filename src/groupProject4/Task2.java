package groupProject4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter min integer number");
        int num1 = input.nextInt();
        System.out.println("Enter max integer number");
        int num2 = input.nextInt();

        int sum =0;

        for ( int i = num1 ; i<=num2; i++){
            if (i % 3 == 0 && i % 11 == 0 ){
                System.out.println(i);
                sum+=i;
            }
        }System.out.println("Sum is " + sum);






    }
}
