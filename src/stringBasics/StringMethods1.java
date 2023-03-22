package stringBasics;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Sunday";

        //length(); count number of characters in given string and return it as integer (number)

        int number = str.length();
        System.out.println(number);

        str += " is a rainy day"; // concat
        int number1 = str.length();
        System.out.println(number1);

        str = str.concat(" and Java is getting easy");
        System.out.println(str);

        //charAt(); --- it will return a single char from given position on a string
        System.out.println("========================");
        str = "re d$";
        char symbol = str.charAt(4);
        System.out.println(symbol); //$
        char symbol2 = str.charAt(0);
        System.out.println(symbol2);//r
        //want to take last char from a given string, but you do not know the index number for last char
        int count = str.length();
        System.out.println(count);//5
        char lastSymbol = str.charAt(count-1);
        System.out.println(lastSymbol);//$

        System.out.println(str.charAt( str.length()-1) );




    }
}
