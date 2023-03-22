package primitives;

public class Farm {
    public static void main(String[] args) {

        /* create a "Farm" class and solve the following task in that class
        in a farm there are12 cows and 45 chix
        calculate number of the legs of the animals
        show the result as "The total number of the legs in the farm is .."
        */
        int cow = 25, cowLegs = 4, chicken = 45, chickenLegs = 2;
        int legs = cow * cowLegs + chicken * chickenLegs;

        System.out.println("The total number of the legs in the farm is " + legs);
        //if a single cow costs 1345.86 and a chicken costs 10.99
        //calculate the worth of the animals
        // show the result as "The worth of the animals is ..."

        double eachCow$ = 1345.86, eachChicken$ = 10.99;
        double worth = (eachCow$ * cow) + (eachChicken$ * chicken);
        System.out.println("The worth of the animals is " + worth);

        //if you you and your partner will share the cost
        // how much each person will get

        double share = worth / 2;
        System.out.println(share);




    }
}
