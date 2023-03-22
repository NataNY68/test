package loops;

public class ForEachPractice {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 7, 8, 9, 10};
        // by using for-each loop print elements

        for ( int number : numbers){

            System.out.println(number);
            System.out.println(number+10);
            System.out.println();

        }
        String[] items = {"Cup", "bottle", "microphone"};
        for (String str : items){
            if (str.equalsIgnoreCase("cup")){
            System.out.println(str);
            }
        }
    }
}
