package encapsulation;

public class Coffeetest {
    public static void main(String[] args) {

        //Task//

        //create a Coffee class
        //- have 3 instance variables
        //-create setters and getters to give access to ythose variables
        //-in a different class, try to access instance variables to initialize or manipulate





        Coffee test = new Coffee();

        test.setPrice(5.25);
        System.out.println(test.getPrice()+" $");

        test.setFlavor("Vanilla");
        System.out.println(test.getFlavor());

        test.setSize(10);
        System.out.println(test.getSize());


    }
}
