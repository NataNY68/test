package arrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(5);
        ArrayList list3 = new ArrayList(list1);

        ArrayList <String> list = new ArrayList();
        list.add("tomato");

        System.out.println(list);
        list.add("cucumbers");
        list.add("potatoes");
        list.add("cherries");
        list.add("lettuce");
        System.out.println(list);
        System.out.println( list.get(4) );  //lettuce
        String item = list.get(3);
        System.out.println(item); // cherries
        list.add(3, "bananas");
        System.out.println(list);
        System.out.println(list.get(3));

        //list.add(9, "apples"); //IndexOutOfBoundsException
        list.add(6, "apples");
        System.out.println(list);

        //add an element, add() an element to aspecific index, get()

        //size()
        int size = list.size();
        System.out.println(size);

        // set() -- it will now replace the element at given index number
        list.set(4, "dressing");
        System.out.println(list);

        //remove()

        list.remove(4);
        System.out.println(list);
        System.out.println(list.size());

        list.remove("bananas");
        System.out.println(list);

        //clear();
        list.clear();
        System.out.println(list);
        System.out.println(list.size());//0

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("bread");
        list5.add("cheese");
        list5.add("mayo");

        list.addAll(list5);
        System.out.println(list);
        list.add("grape");
        System.out.println(list.equals(list5));




    }
}
