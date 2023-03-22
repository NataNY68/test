package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mac");
        list.add("acer");
        list.add("lenovo");
        list.add("mac");
        list.add("mac");

        HashSet <String> set = new HashSet<>(list);
        System.out.println("LIST ---> " + list);
        System.out.println("SET ---> " + set);

        //Iterator

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println("**** " + iterator.next() );
        }

        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println("---> " + iterator1.next() );
        }



    }
}
