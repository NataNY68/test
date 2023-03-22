package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,7,8,1,5,4};
        int a = 9;
        String  str = "";

        for (int i = 0 ; i<arr1.length-1; i++){
            if(arr1[i]+arr1[i+1]==a){
                str+=""+arr1[i];
            }
        }

        int[] arr = new int[str.length()];

        for (int j = 0; j < str.length(); j++) {
            arr[j] = Integer.parseInt(""+str.charAt(j));
        }System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int num");
        int num = 5;
        String st = "";
        for (int i = 1; i <= num; i++) {
            for (int j = num-i; j>0 ; j--) {
                System.out.print(" ");
            }
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
            System.out.println();
            }









    }
}
