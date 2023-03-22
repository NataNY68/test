package my;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create a new and valid password.");
        String password = scanner.nextLine();
        // Please don't change anything on lines above.
        // Please find out whether or not the password is valid.


        for (int i = 0, y=0; i< password.length(); i++) {
            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ) {
                for ( ; y < password.length();y++ ){
                if (password.charAt(y) >= 'A' && password.charAt(y) <= 'Z' ) {
                    System.out.println("true");
                    break;
                }
                }
                }
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ) {
                for ( ; y<password.length(); y++) {
                    if (password.charAt(y) >= 'a' && password.charAt(y) <= 'z') {
                        System.out.println("true");
                        break;
                    }
            }
            }




        }

    }
}


            // for(   ;ch < password.length()-1 ;i++ ){
            //   if (ch >='A' && ch <='Z'){
            //     if (ch >='a' && ch <= 'z' || ch >='A' && ch <='Z' ){
            //       System.out.println(ch >='a' && ch <= 'z');
            //       break;
            //     }}
            //     if (ch >='a' && ch <= 'z'){
            //     if (ch >='A' && ch <='Z' || ch >='a' && ch <= 'z'){
            //       System.out.println(ch >='A' && ch <='Z');
            //       break;
            //     }
            //   }  else {
            //   System.out.println("false");}
            // }



