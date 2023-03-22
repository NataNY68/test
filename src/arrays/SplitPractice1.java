package arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String str = "Selenium";
        String[] parts = str.split("n");
        System.out.println(Arrays.toString(parts));

        //csv files
        //today,is,saturday

        String str2 = "It is a good day to practice java. Snow is outside.";
        str2= str2.replace(".", " ");
        //store every word in an array
        String[] new1 = str2.split(" ");
        System.out.println(Arrays.toString(new1));

        String[] items = {"It", "is", "a", "good", "day", "to", "practice", "java", "Snow", "is", "outside"};
        String space = " ";
        //for ( ; ; )





    }
}
