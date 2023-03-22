package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        String[] word = {"code", "fish", "interview", "mock", "is", "coming", "soon"};
        reverse(word);

        String st = "abc";
        StringBuilder bl1 = new StringBuilder(st);
        System.out.println(bl1 + " is StringBuilder");

       // StringBuilder bl21 = new StringBuilder(word);




        //reverse();
        StringBuilder builder = new StringBuilder("Welcome");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        //toString()

        String str = builder.toString();
        System.out.println(str.toUpperCase());




    }

    public static List<String> reverse(String[] arr){
        List<String> list = new ArrayList<>();

        for (String each :arr){
            StringBuilder builder = new StringBuilder(each);
            list.add(builder.reverse().toString());
        }
        System.out.println(list);
        return list;
    }
}
