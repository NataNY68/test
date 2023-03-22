package groupProject2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Please, write first word");
        String first = name.nextLine();

        System.out.println("Please, write second word");
        String second = name.nextLine();

        String space = " ";
        String together = first.concat(space).concat(second);
        System.out.println(together);

        int indexS = together.indexOf(space);
        System.out.println(indexS);


    }

}
