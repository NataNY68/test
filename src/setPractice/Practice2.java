package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {
        /*
        HashSet ---> No Order, can store null value
        LinkedHashSet ---> Insertion Order, can store null value
        TreeSet ---> Ascending Order, NO null
         */

        HashSet<String> hash = new HashSet<>();
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        TreeSet<String> tree = new TreeSet<>();

        hash.add("apple");         linked.add("apple");          tree.add("apple");
        hash.add("orange");        linked.add("orange");         tree.add("orange");
        hash.add("cherry");        linked.add("cherry");         tree.add("cherry");
        hash.add("strawberry");    linked.add("strawberry");     tree.add("strawberry");

        System.out.println(hash);   System.out.println(linked);   System.out.println(tree);
        hash.add(null);            linked.add(null);             //tree.add(null);
        System.out.println(hash);   System.out.println(linked);   System.out.println(tree);

        System.out.println(tree.first()); //show first elements from tree set - apple
        System.out.println(tree.last());  //find last element from tree set - strawberry
        System.out.println( tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree);
        System.out.println(tree.descendingSet());

        System.out.println( "adding watermelon first time - "+tree.add("watermelon") ); //true
        System.out.println(tree);

        System.out.println(hash.contains("x")); //false
        System.out.println( "adding watermelon second time - "+tree.add("watermelon") ); //false
        System.out.println( "adding WATERMELON  - "+tree.add("WATERMELON") );


    }
}
