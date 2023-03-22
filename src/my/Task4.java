package my;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int num1 = input.nextInt();

        System.out.println("Enter 2 number");
        int num2 = input.nextInt();

        System.out.println("Enter 3 number");
        int num3 = input.nextInt();

        System.out.println("Enter 4 number");
        int num4 = input.nextInt();

        System.out.println("Enter 5 number");
        int num5 = input.nextInt();

        System.out.println("Enter 6 number");
        int num6 = input.nextInt();

        System.out.println("Enter 7 number");
        int num7 = input.nextInt();

        int[] arr = {num1, num2, num3, num4, num5, num6, num7};
        //{ 1, 2, 4, 1, 2 ,3 , 4}
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int uni = 0;
        int a =0;

        for(int i=0; i<arr.length-3; i++){

            if (!(arr[i]==arr[i+1])){
                i+=2;
                System.out.println(arr[i+1]);
            }else {
                System.out.println("no unique");
            }


                }

        }



}

