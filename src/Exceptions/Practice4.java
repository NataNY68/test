package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        FileInputStream stream = new FileInputStream("Test");

        Scanner scanner = new Scanner(stream);

        while (scanner.hasNext()){
            System.out.println(scanner.next());
            System.out.println("$");
            //Thread.sleep(1000);
        }

        int number = 25, day = 27;

        if (day<number){

            throw new RuntimeException();
        }
        System.out.println("This is final example");



    }
}
