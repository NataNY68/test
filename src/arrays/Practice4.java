package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // ask user that how many chocolate names she/he wants to store in an array
        //and user should tell you the names of the chocolates
        //and store them in to an array
        // print stored elements back to the user at the end
        // lindor, milka, twix, ferorro, snickers, m&m
        //if the name is longer than 5 letters, we will put them in separete
        // 5 or less letter shortNames, otherwise longNames

        Scanner input = new Scanner(System.in);
        System.out.println("How many choc names you want to store");
        int size = input.nextInt();
        input.nextLine();

        String[] names = new String[size];
        String[] shortNames = new String[size];
        String[] longNames = new String[size];


        for ( int i=0 ; i < size; i++ ){
            System.out.println("Give the name of chocolate " + (i+1));
            String str = input.nextLine();
            names[i] = str;



            if (str.length()<=5){
                shortNames[i] = str;
            }else {
                longNames[i] = str;
            }
        }
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(names));




    }
}
