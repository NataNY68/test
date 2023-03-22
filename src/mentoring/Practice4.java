package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 5, 2, 3, 6, 7, 9, 4};
        //1, 2, 3, 4, 5, 7, 8, 9
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println(arr[i] + 1);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println(i);
                break;
            }
        }

       // perfect number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int number");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        //  System.out.println(sum == num ? "perfect": "not perfect");
        if (sum == num) {
            System.out.println("It is perfect number");
        } else {
            System.out.println("Not perfect number");
        }

        String ssn = "123-45-6789";
        String[] sn = ssn.split("-");
        System.out.println(Arrays.toString(sn));


//        int i = 0;
//        StringBuilder builder = new StringBuilder(ssn);
//        System.out.println(builder);
//        int b =builder.lastIndexOf("-");
//        int a = builder.i
//        System.out.println(b);
//
//        for (int k = 0; k<b; k++) {
//            if(ssn.charAt(k).i)
//        }





//        String n="";
//        for (int i = 0; i <ssn.length() ; i++) {
//            if(ssn.charAt(i)=='-'){
//                }else{
//                //n=ssn.replace(ssn.indexOf(i), ssn.indexOf(i),"x");
//
//
//            }
//            }System.out.println(ssn);






    }
}
