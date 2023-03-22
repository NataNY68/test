package Exceptions;

public class Practice1 {
    public static void main(String[] args) {

        try {
            System.out.println("******");
            int number = 10;

            String str = "T5";
            int num = Integer.parseInt(str)+10;//NumberFormatException
            System.out.println(num);

            int result = number / 0;
            System.out.println(result);
            System.out.println("I like Math");

        }catch (RuntimeException exception1){
            System.out.println(exception1.getMessage());
            System.out.println("I caught Exception");
        }

        System.out.println("I like Java");


    }
}
