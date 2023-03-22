package primitives;

public class CompoundAssignments {
    public static void main(String[] args) {

        int car = 2;
        System.out.println(car);

        car = car + 1;
        System.out.println(car + " number of the  cars after first purchase");

        car +=1;
        System.out.println(car + " number of the cars after second purchase");

        //selling a car

        car -= 1; // car = car - 1
        System.out.println(car + " after selling one car");

        //sharing cars with another person

        car /=2;
        System.out.println(car + " after sharing with another person");

        car /= 2;
        System.out.println(car + " after sharing single car again");

        //=========================================

        int count = 25;
        count %=7; // count = count % 7
        System.out.println(count);







    }
}
