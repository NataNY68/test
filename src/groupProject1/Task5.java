package groupProject1;

public class Task5 {
    public static void main(String[] args) {
        int quarters = 5, dimes = 4, nickels = 3, pennies = 2;

        double result = 0.25*quarters + 0.1*dimes + 0.05*nickels + 0.01*pennies;
        double roundRes = Math.round(result*100.0)/100.0;
        System.out.println(roundRes);
    }
}
