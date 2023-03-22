package arrays;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {
        String str = "Sunday is daddy day";
        String[] parts1 = str.split("d");

        System.out.println(Arrays.toString(parts1));
        System.out.println(parts1.length);
        String[] parts2 = str.split("d", 3);
        System.out.println(Arrays.toString(parts2));

        String date1 = "12-23-2022";

        String[] parts3 = date1.split("-");
        if (parts3[0].equals("12") && parts3[1].equals("23")){
                System.out.println("Happy Birthday");
        }

        //12/23/2022
        //23-12-2022

        String date2 = "12.23.2022";
        String[] arr2 = date2.split("\\.");
        System.out.println(Arrays.toString(arr2));



    }
}
