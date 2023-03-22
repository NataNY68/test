package object;

public class TestBottle {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(8);
        System.out.println(b1.liquidAmount);//0

        b1.usage(4);
        System.out.println(b1.liquidAmount);//-4

        //create a method that will take bottle object as a parameter
        //and this method will find out if the bottle`s size is greater than 8 oz or not
        //if it is greater than 8, should print "it is large bottle"
        //Bottle b2= new Bottle();

        sizeChecker(b1);

        Bottle b2 = new Bottle(10);

        sizeChecker(b2);

        System.out.println(  b2  ); //hashcode --> location of the object
        System.out.println( b2);

        System.out.println(b1);



    }
    public static void sizeChecker(Bottle abc){

        if (abc.size > 8) {
            System.out.println("it is large bottle");
        }else{
            System.out.println("it is small bottle");
        }
    }

}
