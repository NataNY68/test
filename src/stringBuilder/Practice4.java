package stringBuilder;

import java.util.Arrays;

public class Practice4 {
    //create a method that will take Stringbuilder object
    //and this method will delete "*" from given parameter
    //"t*he in*tervi*ew is co*min*g"

    static public void star(StringBuilder builder){
        for (int i =0; i<builder.length(); i++){
            if(builder.charAt(i)=='*'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);
    }

    static public void removeI(StringBuilder[] arr){
        for (StringBuilder item : arr) {
            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i)=='i'){
                    item.replace(item.indexOf(""+item.charAt(i)), item.indexOf(""+item.charAt(i))+1, "-");
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    //{"code", "fish", "interview", "mock", "is", "coming", "soon"}
    //replace every char 'i' with '-' from given array nof StringBuilder array
    //SOLVE IT BY A METHOD

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("t****he in*tervi*ew i*s co*min*g");
        star(str);


        StringBuilder[] arr = {new StringBuilder("code"), new StringBuilder("fish"), new StringBuilder("interview") , new StringBuilder("mock"),
                new StringBuilder("is"), new StringBuilder("coming"), new StringBuilder("soon")};


        removeI(arr);

    }
}

