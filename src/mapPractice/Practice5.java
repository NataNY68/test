package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {
    public static void main(String[] args) {
        //String str = "Soccer";
        //count how many of each letter from the string
        String str = "Soccer is the best sport";
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i< str.length(); i++) {
            int count = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                    map.put(str.substring(i,i+1), count);
                }
                if(count==1){
                    map.put(str.substring(i,i+1), count);
                }
            }
            }System.out.println(map);

        map.clear();

        String str2 = "coffee";
        for (int i=0; i< str2.length(); i++) {
            String str1 = "" + str2.charAt(i);
            if(map.containsKey(str1)){
                map.put(str1, map.get(str1)+1);
            } else {
                map.put(str1,1);
            }
        }
        System.out.println(map);

        }




    }

