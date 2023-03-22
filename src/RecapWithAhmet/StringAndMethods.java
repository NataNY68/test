package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAndMethods {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- Most of the technical questions are related with String and its Methods

    String is an Object

    2- What is the difference between (.equals()) and (==)
     String (.equals) --> making a comparison of "Two values"
     String name = "Ahmet";  // string memory
     String anotherName = new String ("Ahmet"); //heap memory
     sout(name.equals(anotherName));
     sout(name==anotherName);

     - First of all, tht is a great question. I do not use a lot (==) for String value comparison other than other primitive
     types (int, long, ..).
     When I use String.equals method it compares only the VALUE of the data
     When I use ==, which compares not only the VALUE but also LOCATION of the object

    3- What is String and how do you declare?
    //GENERAL DESCRIPTION
    String is an Object, that used to store some data
    //YOU CAN GO DEEP
    String has some specific methods that we use for any purposes like comparison
    I can declare the String with TWO WAYS
          1-String str;//declaration
            DECLARE: Means, you can create a bucket without assigning any value
            String str2 = "AHMET"; //initializing
            INITIALIZE: Means you create a bucket with Assigning a value.

          2- String str3 = new String(); //Declaration
             String str4 = new String("Ahmet"); //Initializing

    3-STRING METHODS: * MEANS IT IS REALLY IMPORTANT NOT ONLY FOR TECHNICAL BUT ALSO AUTOMATION

    1-indexOf(); --> it gives you the index number of character, it returns int
    2-length(); --> it gives you the size of the data(value), it returns int
    3-concat(); --> it is a way to combine two or more values, either concat or "+", it returns String
    4-split(); --> it a way to cut a words from specific spot, it returns String array;
    5-startsWith(); --> it checks the value starts with a specific characters/words, it returns boolean
    6-endsWith(); --> it checks the value ends with a specific characters/words, it returns boolean
  * 7-substring(); -->it a way to get specific characters or words from string, it returns string
  * 8-charAt(); --> it gives you a character of a specific index spot, it returns char
*** 9-contains(); --> it checks if the value has the data that you are looking for, it returns boolean
*** 10-trim();--> it removes the spaces from the beginning and from the end
  * 11-replace();-->it replace the specific character or words in string, it returns string
*** 12-equals(); --> it compares two values of variable, and it returns boolean
  * 13 - equalIgnoreCase();-->it compares two values of variable without case sensitivity
 ** 14-valueOf(); --> it convert different data type to string type, it returns String
  * 15-toUpper/toLower(); --> it changes the characters to upper/lower case, it returns string

    TIPS: Once you are explaining something in IT:
    1 - Use IT Terminology --> declare, initialize, etc,..
    2 - Explain from generate to deep

     */
    public static void main(String[] args) {

//        String name = "Ahmet";  // string memory
//        String anotherName = new String ("Ahmet"); //heap memory
//        System.out.println(name.equals(anotherName)); //true, check only value
//        System.out.println(name==anotherName); //check not only the value, but also checking the location in heap memory and String Pool
//        System.out.println(name.hashCode());
//        System.out.println(anotherName.hashCode()); // location under the HEAP MEMORY

          String str = "Ahmet loves Java";
          String str1 = new String("Ahmet loves Java");
          String str2 = "Ahmet loves Java";
          String str3 = new String("Ahmet loves Java");
        System.out.println(str.equals(str1)); //true, comparing only value
        System.out.println(str1==str3);//false, we are comparing value, but also location 2 different objects in heap memory
        System.out.println(str==str2); //true, both are in the String pool, are the same

        System.out.println(str.indexOf('t'));//4
        System.out.println(str.length());//
        System.out.println(str.concat(" "+str2));//Ahmet loves Java Ahmet loves Java
        String[] words = str.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(Arrays.toString(words));

        //String str2 = "Ahmet loves Java";
        str2 = str2.replace("Ahmet", "ahmet"); //string is immutable, so you need to reassign to make it valid
        System.out.println(str2.startsWith("Ahmet")); //false
        System.out.println(str2.endsWith("Va")); //false

        char character = str.charAt(3);
        String sbsr = str.substring(3,4);
        System.out.println(character);
        System.out.println(sbsr.toLowerCase());
        System.out.println(sbsr.toUpperCase());
        String example = "Hello Guys";
        String example2 = "hello guys";
        System.out.println(example.equalsIgnoreCase(example2)); //true, I would use 99 percent equals for validation
        int number = 5;
        int number2 = 3;
        String bucket = String.valueOf(number)+String.valueOf(number2);
        System.out.println(bucket);
        boolean result = str2.contains("av");//"Ahmet loves Java";
        System.out.println(result); //true

        String lastExample = "  We are completing String  ".trim();
        String lastExample2 = "We are completing String";
        System.out.println(lastExample.equals(lastExample2)); //true









    }
}
