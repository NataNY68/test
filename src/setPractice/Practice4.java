package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mac");
        list.add("acer");
        list.add("lenovo");
        list.add("mac");
        list.add("mac");
        list.add("lenovo");
        System.out.println(list);



        //find out repeating elements from the given list
        //use set in to your soliution
        //add();
        //store repeating elem
        ArrayList<String> duplicates = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (String item :list){
                if(!set.add(item)){
                    System.out.println(item);
                    duplicates.add(item);
                }
            }

        System.out.println(" >> duplicates: -->" + duplicates);






    }
}
