package groupProject1;

public class Task6 {
    public static void main(String[] args) {
        double dollar = 2.36;
        int dollarInCent = 236;


        int quarter = 25, dime = 10, nickel = 5, penny = 1;

        int q = dollarInCent / quarter; // 9 - amount of quarters
        int leftOver = (dollarInCent % quarter); // 11 = left over
        int d = leftOver / dime; // 1 - amount of dimes
        int leftOver1 = leftOver - d * dime; // 1 - new left over (after substracting all dimes)
        int n = leftOver1 / nickel; // 0 - amount of nickel
        int leftOver2 = leftOver1 - n * nickel; // new left over
        int p = leftOver2 / penny; // 1 - amount of penny
        System.out.println(dollar + " $ will make " + q + " quartes " + d + " dime " +
                n + " nickel and " + p + " pennies");


        System.out.println();


    }
}
