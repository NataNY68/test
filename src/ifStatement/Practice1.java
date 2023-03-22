package ifStatement;

public class Practice1 {
    public static void main(String[] args) {
        int money = 100;
        int item$ = 250;

        System.out.println("First Print before if statement");

        if( money > item$ ){

            System.out.println("You are buying the item");

        }

        System.out.println("Another print AFTER if statement");
        int item2$ = 99;

        if(money>item2$){

            System.out.println("I am buying item2");

        }
        //you have another option as using your credit card if your money is not enough

        boolean creditCard = true;

        if (money > item$ || creditCard == true){

            System.out.println("You are using 2 different option to buy item");
        }



    }
}
