package groupProject4;

public class Task1 {
    public static void main(String[] args) {
        String str = " Dream Job! for  me   ";
        String reverse = "";

        for (int i=str.trim().length(); i>0 ; i-- ){
            reverse += str.charAt(i);
        }System.out.println(reverse);

        //===========================

        String str1 = " FGHJKL;,MNBVC";
        int i=0;
        String reverse1 = "";

        for (; i < str1.length();i++ ){
            str1=str1.trim();
            reverse1 += str1.charAt(str1.length()-(i+1));
        }System.out.println(reverse1);


    }
}
