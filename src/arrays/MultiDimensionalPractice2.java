package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {

        String[][] citiesFromStates = {   {"Los Angeles" , "Sacramento"} , {"Chicago", "Springfield", "Des Plaines"} ,
                {"Baltimore", "Rockville"}   };

        // using for each loop to show names of the cities
        //print out  --> when you find chicago --> "Chicago is in IL"

LABEL:
        for (String[] names: citiesFromStates){
          LABEL1:  for (String cityNames :names) {
                if (cityNames.equalsIgnoreCase("chicago")){
                    System.out.println(cityNames + " --> is in IL");
                  //  break LABEL;
                }else
                    System.out.println(cityNames);
          }
        }







    }
}
