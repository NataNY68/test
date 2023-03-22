package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Task {

        //create a method that will take string array as parameter
        //and it will return values as a set collection
       static String[] data = {"phone", "clock", "timer", "cup", "microphone", "clock", "microphone"};

    public static Set<String> items(String[] array){
        HashSet<String> set = new HashSet<>();
        for (String name :array) {
            set.add(name);
        }
        return set;
    }

    public static void main(String[] args) {
        items(data);
        System.out.println(items(data));

        Set<String> abc = items(data);

    }


}
