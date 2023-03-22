package loops;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] flowers = {"rose", "daisy", "sunflower"};

        for (String flow : flowers){
            System.out.println(flow.toUpperCase());
        }

        String[] cities = {"Chicago", "Miami", "New York", "Tokio", "Doha", "Denver"};

        //chicago@gmail.com
        //put those emails addresses in another storage for future reference
        String[] cityEmails = new String[cities.length];
        int i =0;

        for (String city : cities){
            cityEmails[i] = city.toLowerCase().replace(" ", "").concat("@gmail.com");
            i++;

        }            System.out.println(Arrays.toString(cityEmails));






    }
}
