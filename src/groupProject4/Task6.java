package groupProject4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string value, please");
        String str = input.nextLine();
        String str2 = "";


        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                if (i==0){
                    str2 += str.charAt(i);
                }else {
                    str2+=" ";
                    str2 += str.charAt(i);
                }
            }
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    str2+=str.charAt(i);
                }
                }System.out.println(str2);




            }
        }



