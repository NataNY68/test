package primitives;

public class RemainderPractice3 {
    public static void main(String[] args) {

        int numberOfCars = 10;
        int numberOfPartners = 3;

        // how many car each person will get?

        int eachPerson = numberOfCars / numberOfPartners;
        System.out.println(eachPerson);  // shows 3

        //how many car or cars will be left over?

        int leftOverCars = numberOfCars % numberOfPartners;
        System.out.println(leftOverCars);

        /*
        TV, 465 dollars, each month we want to pay 50 dollars, find last month payment
         */

        int tv = 465;
        int month = 50;
        int lastPayment = tv % month;

        System.out.println(lastPayment);
        System.out.println(tv/month);

        //===================================//

        double tv2 = 465.50;
        double month2 = 50;
        double eachMonth = tv2 % month2;


        System.out.println(eachMonth);







    }
}
