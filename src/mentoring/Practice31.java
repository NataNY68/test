package mentoring;

import java.util.*;

public class Practice31 {
    public static void main(String[] args) {
        Map<String , String > map1 = new HashMap<>();
        map1.put("apple", "1");
        map1.put("peach", "2");
        map1.put("banana", "3");

        Map<String , String > map2 = new HashMap<>();
        map2.put("cherry", "4");
        map2.put("lemon", "5");
        map2.put("strawberry", "6");

        Map<String , Map<String, String>> map3 = new HashMap<>();
        map3.put("map1", map1);
        map3.put("map2", map2);

        System.out.println(map1);
        System.out.println(map2);

        System.out.println(map3.get("map1").get("banana"));

        Map <String, String > firstLevel = map3.get("map1");
        firstLevel.get("banana");

        String price = "5";
        String items = "1 3 4 5 1 5 6 8 11 13 12 2 2 7";
        String[] str = items.split(" ");
        Set<String> set = new HashSet<>();

        for (int i=0; i<str.length; i++){
            set.add(str[i]);
        }System.out.println(set);

        int result = (set.size() - 2)*5;
        System.out.println(result);

        Set<String> set1 = new HashSet<>(Arrays.asList(str));
        System.out.println((set1.size()-2)*5);












    }
}
