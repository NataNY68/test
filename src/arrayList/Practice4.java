package arrayList;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {

        //create an arraylist to store 5 city names
        // implement a logic to print only city names that have 6 or more letters

        ArrayList<String> cities = new ArrayList<>();
        cities.add("LA");
        cities.add("London");
        cities.add("Chicago");
        cities.add("Rome");
        cities.add("Miami");

        for ( String city: cities){
            if(city.length()>=6){
                System.out.println(city);
            }
        }

        System.out.println("=========");

        for (int i=0; i<cities.size(); i++){
            if (cities.get(i).length()>=6){
                System.out.println(cities.get(i));
            }
        }




    }
}
