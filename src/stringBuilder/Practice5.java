package stringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice5 {
    //String[] word = {"code", "fish", "interview", "mock", "is", "coming", "soon"};
    //reverse given array as a list

    public static List<String> reverse(String[] arr){
        List<String> list = new ArrayList<>();

        for (String each :arr){
            String str = "";
            for (int i = 0; i < each.length(); i++) {
                str +=each.charAt(each.length()-(1+i));
            }
            list.add(str);
        }
        return list;
    }


    public static List<String> ReversedW(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return Arrays.asList(words);
    }


    public static void main(String[] args) {
        String[] word = {"code", "fish", "interview", "mock", "is", "coming", "soon"};
        reverse(word);
        System.out.println(reverse(word));

        System.out.println(reverse(word));


    }


}
