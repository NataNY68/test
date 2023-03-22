package stringBasics;

public class StringMethods4 {
    public static void main(String[] args) {

        String season = "winter";

        //substring(); --> returns String

        String part = season.substring(1);
        System.out.println(part);

        String part2 = season.substring(1,4);
        System.out.println(part2);
        //System.out.println(season.substring(9));//StringIndexOutOfBoundsException

        String task = "Welcome to Chicago";
        // take and print out word 'do' only from above string
        System.out.println(task.substring(5,8));

        //make above task solution dynamic
        System.out.println(task.substring(task.indexOf(" ")+1, task.indexOf(" ", task.indexOf(" ")+1)));
        int firstSpaceIndex = task.indexOf(' ');
        int secondSpaceIndex = task.indexOf(' ', firstSpaceIndex + 1);
        String secondWord = task.substring(firstSpaceIndex +1, secondSpaceIndex);
        System.out.println(secondWord);
    }
}
