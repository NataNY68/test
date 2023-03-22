package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
    //create a method that will take a map
    //this method will add a message to each key as follows:
    // .. is the best key

    public static void bestKey(Map<String, String> map){
        for (String key: map.keySet()) {
            System.out.println(key + " is the best key");
            //print out values
            System.out.println(map.get(key)+ " number");
        }
    }

    public static void main(String[] args) {
        Map <String , String> map1 = new HashMap<>();
        map1.put("Alex", "7");
        map1.put("David", "6");
        map1.put("Messi", "10");
        map1.put("Hagi", "10");

        bestKey(map1);




    }

}


