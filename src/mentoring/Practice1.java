package mentoring;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
//first 10 numbers of fibbonacci

        //0, 1, 1, 3, 4, 7, 11, 18

        int num1=-1;
        int num2 = 1;
        for (int i=10; i>0; i--){
               int num = (num1+num2);
               num1=num2;
               num2=num;
            System.out.print(num + " ");
        }

        System.out.println();

        int a1 = 0, b1 = 1, c = 0;
        for(int i = 0; i < 10; i++){
            System.out.print(a1 + " ");
            c = a1 + b1;
            a1 = b1;
            b1 = c;
        }
        System.out.println();

        String str = "Hi peoples here";
        String[] arr = str.split(" ");
        //System.out.println(Arrays.toString(arr));


        for (String name :arr) {
            String reverse = "";
            for (int i=0; i< name.length(); i++){
                reverse+=name.charAt(name.length()-i-1);
            }
            System.out.print(reverse + " ");
        }
        String s = "hackerrank";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i'||
                    s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                s =s.replace(s.charAt(i) + "", "");
            }
        }
        System.out.println(s);



    }
}
