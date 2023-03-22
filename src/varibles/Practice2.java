package varibles;

public class Practice2 {

    public static void main(String[] args){
       //java reads code from top to bottom and left to right
       //dataType name = value --> full syntax to create a new variable
       //you cannot use Java reserved words as variable name

        int apple = 10;  // declaring and initializing variable

        int number;   //--> declaring variable

        // System.out.println(number); //error since since number does not have the value yet

        number = 10;   // --> initializing variable (assigning value to the variable)

        System.out.println(number);

        System.out.println(number + 5); //shows --> 15
        System.out.println("number" + 5); //shows --> number5
        System.out.println(number); //10

        number = 20;

        System.out.println(number); // reassigning value for number
        System.out.println(number*2); //40




    }
}
