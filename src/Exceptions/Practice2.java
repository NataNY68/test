package Exceptions;

public class Practice2 {
    public static void main(String[] args) {



        try{
            System.out.println("   FIRST    ");
            String str = "b15";
            int num = Integer.parseInt(str); //NumberFormatException

            System.out.println("   SECOND   ");
            int result = 15/0;

            System.out.println("   THIRD   ");
        }catch (ArithmeticException e) {
            System.out.println("  CATCH  ");
        }catch (NumberFormatException e1){
            System.out.println("  CATCH2  ");
        }

        try {
            String str = "last";
            String reverse = "";

            for (int i = str.length(); i >=0; i--) {
                reverse+=str.charAt(i);
            }
            System.out.println(reverse);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }


        System.out.println("*****");





    }



}
