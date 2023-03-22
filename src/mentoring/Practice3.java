package mentoring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice3 {
    public static void main(String[] args) {
        //34567 --> 3+4+5+6+7 = 25;
        int num = 34567;
        int sum=0;
        while(num!=0){
            sum+= num%10;
            num=num/10;
        }
        System.out.println(sum);

        System.out.println("+++");
        String str = "34567";
        int n = 0;
        String[]str1=str.split("");
        for (String st:str1){
            n += Integer.parseInt(st);
        }System.out.println(n);

        int given = 1234;
        int result = 0;

        for(int i=1; i>0 ; i++){
            if (given >0){
                result+=given%10;
                given= given/10;
            }else break;
        }
        System.out.println(result);

        //==========================

        //count how many each letters in a given string using Map

        String name = "football";
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<name.length();i++){
            String str2 = "" + name.charAt(i);
            if(map.containsKey(str2)){
                map.put(str2,map.get(str2)+1 );
            }else {
            map.put(str2,1);}
        }
        System.out.println(map);





    }
}
