package RecapWithAhmet;

public class Exceptions {
    /*
    POSSIBLE INTERVIEW QUESTION:
    1-How do you handle exceptions?
    -->We can handle the exception with TRY AND CATCH BLOCKS, AND THROWS

    2-Can you use more than one catch block? How about try block?
    --> You can use more than 1 catch block, but only 1 try block

    3-What do you know about final, finally, finalize?
    -->Final is a keyword, to make the variable or method or class unchangeable(last version)

    -->Finalize is a method to clean up the unused/useless data (it works with Garbage Collector)
       For proof we override the finalize method

    -->Finally is a block, that comes after try and catch block to do final execution no matter what

    4-What is the difference between THROW and THROWS?

    --> Both Throw and Throws are the concept of exception handling in which
    throws I used to explicit (out of block) throw the exception from a method

    --> public void exception() throws NumberFormatException

    --> public void exception2() {
    new throw NumberFormatException(e)
    }

    **While THROWS are used next to method signature (OUTSIDE OF BLOCK)
    **THROW is used inside the block
     */

    public static void main(String[] args) throws InterruptedException {
        String numbers = "$199";
//        System.out.println(numbers);
//        int price=Integer.parseInt(numbers);
//        System.out.println(price);

        try {
            System.out.println(numbers);
            int price = Integer.parseInt(numbers);
            System.out.println(price);
        } catch (NumberFormatException exception) {
            System.out.println("Your price parsing is not working");
            throw new NumberFormatException();
        }finally {
            System.out.println("I am finally block");
        }

        Thread.sleep(3000);
    }


}
