package loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        //use do-while to solve the task
        //get two positive int numbers from user and find the sum of the range
        //2, 7 --> 3+4+5+7 = 19;

        Scanner name = new Scanner(System.in);
        System.out.println("Enter the two int positive numbers");
        int num1 = name.nextInt();
        int num2 = name.nextInt();
        num1 = num1+1;//num1++; increasing num1 by 1
        int sum = 0;

        do {
            sum +=num1;
            num1++;
        }while (num1<num2);
        System.out.println(sum);


    }
}
