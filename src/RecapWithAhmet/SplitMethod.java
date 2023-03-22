package RecapWithAhmet;

import java.util.Arrays;

public class SplitMethod {

    /*
    String str="Hello Java is so good"

output:olleH avaJ si  os doog
       avaJ
       si
       os
       doog
     */

    public static void main(String[] args) {
        String str="Hello   Java is so good";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        for (String word :arr) {
            String str1 = "";
            for (int i = word.length()-1; i >=0; i--) {
                str1 +=word.charAt(i);
            }
            System.out.println(str1 + " ");
        }

    }


}
