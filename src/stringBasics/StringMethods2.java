package stringBasics;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "phone";
        System.out.println(str.charAt(4)); //e
        // System.out.println(str.charAt(5)); //error
       // System.out.println(str.charAt(-3)); //error run time
       // System.out.println(str.charAt(str.length()  )); //error
        System.out.println(str.charAt(str.length() - 2 )); //n

        //indexOf()
        System.out.println(str.indexOf('p')); //0
        System.out.println(str.indexOf("p")); //0
        System.out.println(str.indexOf("ph"));// 0 --> if given chars will match within the string
                                              //in the same order sequence, it will return
                                               // first matching char`s index number
        System.out.println(str.indexOf("ne")); //3
        System.out.println(str.indexOf("nE")); //-1

        str = "new York";
        // index number of space
        System.out.println( str.indexOf(" ") ); //3

        str = "happy evening to you";
        //find index of second 'y'
        System.out.println(str.indexOf('y'));//4
        System.out.println(str.indexOf('y', 5));//17

        //how to pass index 5 above by dynamically

        int indexOfSecondY = str.indexOf('y', str.indexOf('y')+1);
        System.out.println(indexOfSecondY);

        String word = "Java is getting easy ;)";

        //find the second spaces index number
        System.out.println(word.indexOf(" "));//4
        System.out.println(word.indexOf(" ", word.indexOf(" ")+1)); //7
        String space = " ";
        System.out.println(word.indexOf(space, word.indexOf(space)+1)); //7

        System.out.println(word.indexOf("Java is getting easy ;)")); //0

        String text = "DO whatever it Takes";

        System.out.println(text.toLowerCase());//everything lower case
        System.out.println(text.toUpperCase());//upper case
        String str2 = text.toUpperCase();
        System.out.println(text); //DO whatever it Takes
        System.out.println(str2);

        text = text.concat(str2).toUpperCase();
        System.out.println(text);

        text += text.concat(str2).toUpperCase();
        System.out.println(text);


    }
}
