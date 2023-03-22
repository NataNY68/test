package object;

public class Bottle {
    /*
    * Create a Bottle class
	-double size
	-boolean isClean
	-double liquidAmount
-- create one argument constructor to intialize isClean variable
-- create one argument constructor to initalize size
-- create one usage method which takes double amount as parameter and it updates the liquidAmount
     */

    public double size;
	public boolean isClean;
	public double liquidAmount;

    public Bottle(boolean isClean){
        this.isClean = isClean;
        System.out.println("First constructor");
    }

    public Bottle(double size){
        this(true);
        this.size = size;
        System.out.println("Second constructor");

    }

    public void usage(double amount){
        liquidAmount-=amount;
    }

    public String toString(){
        return "Size: "+ size + " isClean: " + isClean + " liquidAmount: "+liquidAmount;

    }




}
