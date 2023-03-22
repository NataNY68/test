package Exceptions;

import java.util.Map;

public class Practice3 {

    //create a method
    //this method have some implementation
    //there will be type of exception in your logic
    //handle that exception with try-catch blocks


        public static void method(){
            try {
                int[] arr = {1,2,3,4};
                System.out.println(arr[7]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("I caught exception");
            }finally {
                System.out.println("Finally block");
            }
            }

    public static void main(String[] args) {

        System.out.println("First lane");
            method();

            System.out.println("After method call");


    }
}
