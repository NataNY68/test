package loops;

public class ReversingString {
    public static void main(String[] args) {
        /*
        check if given string is palindrome or not
        EFE, YAY
         */

        String str = "levele";

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(str.length() - (i + 1))) {
            } else {
                System.out.println("no");
                break;
            }

        }            System.out.println("yes");


    }
}

