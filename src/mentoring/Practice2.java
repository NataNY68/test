package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        String s1 = "mama";
        String s2 = "amam";

        boolean flag = false;

        char[] a = s1.toCharArray();
        char[] b = s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i]==b[i]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if (flag){
            //System.out.println("Positive result");
        }else {
           // System.out.println("Negative result");
        }

        //reverse array[]

        /*
        Find all unique char in a given string

         */


        String uni = "";

        String str = "aabcffgtte";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i !=j) {
                    count = 1;
                    break;
                }
                }
            if (count ==0){
               System.out.println(str.charAt(i));
            }
            }

        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] abc = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            abc[abc.length-(i+1)]=array[i];
        }System.out.println(Arrays.toString(abc));

        double num1 = Math.pow(10,2);
        System.out.println(num1);

        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        // Please don't change anything on lines above
        int len = password.length();



        if ( password.charAt(len-1)>0
                && password.charAt(len-1)<9){
            System.out.println("Your password is strong");
        }



















    }
}
