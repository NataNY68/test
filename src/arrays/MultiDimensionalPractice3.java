package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice3 {
    public static void main(String[] args) {

        String [][][] items = {  { {"car"}, {"dolls"}, {"abc"} },  {  {},  {} },  {  {"napkins"} }  };

        System.out.println(Arrays.deepToString(items));

        for (String[][] one : items){

            for( String[] two : one){

                for ( String item : two){

                    System.out.println(item);

                    if (item.equalsIgnoreCase("napkins")){

                        System.out.println("Got it!");
                    }
                }
            }

        }





    }
}
