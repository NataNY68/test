package RecapWithAhmet;

import java.util.*;

public class ListPractice {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is the difference between List and array

    Array - is a storage for the Primitives and Objects
    The purpose of usage: WE can store the data temporarily and use it for different purposes.
    (It is a simple way of storing multiple data at the time)

    ArrayList                                         Array:
    1- Dynamic size                                   1-Fixed size
    2- Storage for only Objects                       2-Primitive and Object
    3- It doesn't have multidimensional form          3-It does have multidimensional form
    4- It has some good method (add, get, size, )     4-It doesn't`have methods, but only one function(length() ).
    5- ArrayList can be manipulable                   5-It is not manipulable, because there is no method.
    6- Syntax is different                            6- Syntax is different

    2-What is the difference between ArrayList and LinkedList?

    --> List is a part of Collection. And it is used for storage (Objects).
      --> ArrayList --> It is a way to store Object and access these objects with a specific methods (get()).
      --> LinkedList --> It is a way to store Object and access these objects with a specific methods (get()).

      To be honest I do not use LinkedList in my project, but as much as I know there is execution time
      difference for accessing the data from the list

      SHOW OFF:
      **** The reaching out the elements inside of the list is more efficient and faster in Arraylist
      ArrayList<Object>  --> arraylist.get(0) --> 0.02
      LinkedList<Object>  --> linkedlist.get(0) --> 0.04

      *** -->When you do any manipulation (changing value, replacing, inserting, removing)
      at this moment LinkedList will be faster

     */

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        LinkedList list3 = new LinkedList<>();
        List list4 = new LinkedList();

        list2.add("Hello"); ///long way, do not used it one by one
        System.out.println(list2.get(0));

        List<String> names = Arrays.asList("Ahmet", "Mehmet", "Mahmut", "Kerem", "Ayse");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names);

    }

}
