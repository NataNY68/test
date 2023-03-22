package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Practice51 {

    public static String checkArray(int[] arr){
        Arrays.sort(arr);
        int s = arr[1];
        int b = arr[arr.length-2];
        String s1 = String.valueOf(s);
        String s2 = String.valueOf(b);


        return s1 + " " + s2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 9};
        checkArray(arr);
        System.out.println(checkArray(arr));

        /*
        Find second largest, and second smallest element of array
        return '4 '5'
         */
    }
}
