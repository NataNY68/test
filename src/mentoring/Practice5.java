package mentoring;

public class Practice5 {

    public static String reverseStr(String str){
        String res = "";
        for (int i = str.length()-1; i >=0; i--) {
            res+=str.charAt(i);
        }
        return res;
    }



    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseStr(s));







    }
}
