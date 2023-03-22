package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {

        //travel --> passport and ticket

        boolean passport = false;
        boolean ticket = true;

        boolean travel = passport && ticket;
        System.out.println("Can travel? "+travel);

        //party --> dressCode and age

        boolean dressCode = true;
        boolean age = true;
        boolean canAttendParty = dressCode && age;

        System.out.println("Can attend the party? " + canAttendParty);

        //there is an event for kids and they allow if the age of child between 12 and 16
        int kidAge = 10;
        int lowerLimit = 12, upperLimit = 16;
        boolean happyToPlay = kidAge > lowerLimit && kidAge < upperLimit;

        System.out.println(happyToPlay);

        //parents want to come together for a family dinner, but kids who are
        // of 12 (inclusive) to 18 (inclusive) do not want to go with them
        //adult and younger kids are together

        int age1 = 65;
        int limit1 = 12;
        int limit2 = 18;

        boolean kidsGo = age1 <= limit1 || age1 >=limit2;
        System.out.println("with Adults " + kidsGo);

        // || OR
        //cash    card

        boolean cash = false, card = true, buy;
        buy = cash || card;

        System.out.println("Buy " + buy);

        //travel  >> a type of ID (pass / government ID), visa, ticket, need to have money (more than 5000$)

        boolean pass = true, govId = false, visa = true, ticket1 = true;
        int money = 600, moneyLimit = 5000;
        boolean travelTurkey = ( pass || govId ) && visa && ticket1 && (money > moneyLimit);

        System.out.println(travelTurkey);

        System.out.println('B'+2 == 3 * 'C' || !true && 'C' <'B'/3);

        char a = '4';
        System.out.println(a);








    }
}
