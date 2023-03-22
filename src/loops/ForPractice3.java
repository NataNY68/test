package loops;

public class ForPractice3 {
    public static void main(String[] args) {
        String str = "It is cloudy day in Chicago";

        //print our --> 'I found a lowercase 'c' when you see a lowercase 'c'
        //how to count how many lowercases 'c'
        int counter = 0;
        for (int num = 0 ; num < str.length(); num++){
            if (str.charAt(num) == 'c'){
                counter++;
                System.out.println("I found a lowercase 'c'");
            }
            //print out letters  'i' from the str
            if ( str.charAt(num) == 'i'){
                System.out.println(str.charAt(num));
            }

        }System.out.println("I found " + counter + " lowercase 'c' in the string");
    }
}
