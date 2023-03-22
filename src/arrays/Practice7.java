package arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        String[] brands = {"Nike", "Adidas", "Puma", "New Balance", "Reebook"};
        //print every brand name in reverse version
        int length = brands.length;
        String[] reverseArray = new String[brands.length];


        for (int i = 0; i<brands.length; i++){

            //System.out.println(brands[i]);
            String reversed = "";

            for (int k = brands[i].length()-1; k>=0; k-- ){
                reversed += brands[i].charAt(k);
            }
            reverseArray[i] = reversed;
            System.out.println("reversed of " + brands[i] + " >> " + reversed);
        }
        System.out.println(Arrays.toString(reverseArray));

    }
}
