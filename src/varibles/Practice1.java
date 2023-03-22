package varibles;

public class Practice1 {
    public static void main(String[] args){

      //I want to add numbers 2, 5, 3 and show the total in the console

        System.out.println(2 + 3 + 5);

        //varibles
        int redApples = 3;
        int greenApples = 5;
        int yellowApples = 2;

        // I want to print Number of Red apples is 3

        System.out.println(redApples); // it will show 3
        System.out.println("Number of red Apples is" + 3);
        System.out.println( "Number of Red Apples is " + redApples);

        //create a variable and name it as "total"
        //get the value for this "total" variable by adding apples together
        // print out the total in a sentence --> Total numbers of apples is ...

        int total = redApples + yellowApples + greenApples;
        System.out.println("Total number of apples is " + total);

        // create variables for prices of each apple type
        // each red -> 2, each green ->3, each yellow ->4
        // create variable for total cost
        // show that how much you need to pay for all together

        int priceRed = 2;
        int priceGreen = 3;
        int priceYellow = 4;
        int totalPrice = priceRed * redApples + priceYellow *yellowApples + priceGreen*greenApples;
        System.out.println("The total cost for all apples is " + totalPrice);

        // int redApples = 11; you cannot create multiple variables by using same name;





    }
}
