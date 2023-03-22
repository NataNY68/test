package ifStatement;

public class NestedPractise {
    public static void main(String[] args) {
        /*
        Travelling
        -id
        -visa
        -tickets
         */

        boolean id = true, visa = true, ticket = false;

        System.out.println("Checking ID now ...");

        if (id) {
            System.out.println("Checking visa now...");
            if (visa){
                System.out.println("Checking ticket now...");
                if (ticket){
                    System.out.println("Enjoy your flight");
                }else {
                    System.out.println("You should have a ticket");
                }
            }else {
                System.out.println("You should have visa");
            }
        }else {
            System.out.println("You should have valid ID");
        }


    }
}
