package mapPractice;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 13);
        map.put("b", 27);
        map.put("c", 56);
        map.put("d", 5);
        map.put("e", 100);
        filter(map);
        List<Integer> list1 = filter(map);
        System.out.println(list1);





    }
    //create a method that will get a map as a parameter
    //given map as parameter should be Map<String, Integer>
    //this method will find all values from the given map
    //and this method will return if the value is >25 in a list
    //this method returns those greater numbers as a list

    public static List<Integer> filter(Map<String, Integer> name){
        List<Integer> list = new ArrayList<>();
        for (Integer value  : name.values()) {
            if (value > 25){
                list.add(value);
            }
        }
        return list;

    }




}
