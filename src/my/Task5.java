package my;

public class Task5 {
    public static void main(String[] args) {
        String str = "eerqwertyree";
        String a = "";
        int i = 0;
        for (; i < str.length(); i++) {
            char last = str.charAt(str.length() - (i + 1));

            if (str.charAt(i) == str.charAt(str.length() - (i + 1)) && i<str.length()/2) {
                a += ""+str.charAt(i);
            }
        }                System.out.println(a);


    }}

