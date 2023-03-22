package ifStatement;

import java.util.Scanner;

public class ElseIfPractice3 {
    public static void main(String[] args) {
            /*
        There three test for a class
        - to get letter scores for averages
        use the following scale
        90 - 100 --> A grade
        80 - 89 --> B
        70 - 79 --> C
        60 - 69 --> D
        less than 59 --> please come again
         */

        Scanner name = new Scanner(System.in);
        System.out.println("Please, enter your first grade");

        int firstGrade = name.nextInt();

        System.out.println("Please, enter your second grade");
        int secondGrade = name.nextInt();

        System.out.println("Please, enter your third grade");
        int thirdGrade = name.nextInt();

        int average = (firstGrade + secondGrade + thirdGrade)/3;


        if ( average>=90){
            System.out.println("A grade");
        }else if (average<90 && average>=80){
            System.out.println("B");
        }else if (average<80 && average>=70){
            System.out.println("C");
        }else if (average<70 && average>=60){
            System.out.println("D");
        }else if (average<60 ) {
            System.out.println("Please come again");
        }







        }
    }

