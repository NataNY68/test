package RecapWithAhmet;

import java.util.Scanner;

public class Loops {
    /*
    POSSIBLE INTERVIEW QUESTIONS
    1-Many technical and automation questions are required the loops

    TYPES OF LOOPS
    1-Do while --> no matter what, it will run the code ONCE
    2-While --> it will check the condition, and run based on that
    3-For --> it will initialize variable, condition and Pre-post Increment(i++, i--)
    4-ForEach --> it will access all of the data in the storage. (ITERATE one by one)

    NOTE: Every loop type must have either 'break' or increment/ decrement
     */



    public static void main(String[] args) {
//        String username ="";
//        do{
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please, enter your username");
//            username = scanner.nextLine();
//            System.out.println(username);
//        }while (username.startsWith("A"));
//    }
        //WHILE --> ask the user put an int number, and reverse this int number
        //by using while loop, and String
        //multiply the digits
        //exp. 12345 --> FIRST OUTPUT - 54321; --> SECOND OUTPUT - 120;

        //1 - verify the questions with interviewer
        //2 - Loudly you can think of the steps you will follow
        //3 - put the steps on your mind directly
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input a number");
//        int number = scanner.nextInt();
//        String reverse = "";
//        int total = 1;
//        while(number!=0){
//            int digit = number%10;
//            reverse+=digit;
//            total*=digit;
//            number/=10;
//        }
//        System.out.println(reverse);
//        System.out.println(total);

        /*
        /*
      HOMEWORK:
  USING SCANNER: Ask user to enter one string value with 3 words
  1-Print first letter of Each Word
  2-Print last letter of each Word
  3-Print the total index of first letters
  4-Print the sum of the last letter of each word's index number
  5-Print the difference between total last index and total first index

  CLUES:I would use if condition for charAt and ' '

  EXAMPLE:"Ahmet Loves Java"
  //output:ALJ
  //output:tsa
  //output:18
  //output:29
  //output:11

  NOTE:YOu can use either one or two loops.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = scanner.nextLine();
        String first = str.substring(0,1);
        String last = "";
        int indexOfFirst = 0;
        int indexOfLast = str.length()-1;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                first+=str.charAt(i+1);
                last+=str.charAt(i-1);
                indexOfFirst += i+1;
                indexOfLast+=i-1;
            }
        }
        last+=str.charAt(str.length()-1);
        System.out.println(first);
        System.out.println(last);
        System.out.println(indexOfFirst);
        System.out.println(indexOfLast);
        int result = indexOfFirst - indexOfLast > 0  ? indexOfFirst - indexOfLast  :  indexOfLast - indexOfFirst;
        System.out.println(result);


    }


    //



}
