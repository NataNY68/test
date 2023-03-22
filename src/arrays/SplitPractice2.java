package arrays;

import java.io.OutputStream;
import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {

        String str = "The FIFA World Cup, often simply called the World Cup, is an" +
                "international association football competition contested by the senior" +
                "men's national teams of the members of the Fédération Internationale de" +
                "Football Association (FIFA), the sport's global governing body. The" +
                "tournament has been held every four years since the inaugural tournament in 1930, " +
                "except in 1942 and 1946 when it was not held because of the Second World War." +
                "The reigning champions are France, who won their second title at the 2018 " +
                "tournament in Russia.";

        //find out words that has even numbers of characters

        str = str.replace(",", "").replace(".", "").replace("(", "").
        replace(")", "").replace("'", "").replace("\"", "");

        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));

        for (  int i =0; i <str1.length; i++){
            if (str1[i].length() %2 ==0){
                System.out.println(str1[i]);
            }
        }

    }
}
