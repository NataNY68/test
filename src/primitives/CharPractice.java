package primitives;

public class CharPractice {

    public static void main(String[] args) {

        char letter1 = 'A';

        System.out.println(letter1); // shows A

        char symbol1 = '*';

        System.out.println(symbol1); //shows *

        char letter2 = 'z'; //ASCII tabble 122
        System.out.println(letter2); // shows z

        char symbol2 = '6';
        System.out.println(symbol2);

        System.out.println(symbol2 + letter2 ); //expectation 6z

        //z - 122, 6 - 54 from ASCII table

        int symbol3 = 'z';
        System.out.println(symbol3); // shows z - 122 from ASCII table

        char symbol4 = 90;
        System.out.println(symbol4); // upper case Z from ASCII Table (has 90 number)

        //try to do similar implementation four first

        int symbolA = 's';
        int symbolC = 'f';
        System.out.println(symbolA);
        System.out.println(symbolA + symbolC);

        char symbolB = 100;
        System.out.println(symbolB);

        //E

        char init = 'E';
        char initAsNumber = 69;
        int initAsChar = 'E';

        System.out.println(init);
        System.out.println(initAsNumber);
        System.out.println(initAsChar);

        //you want to print everything as in the single print

        System.out.println(""+ init + initAsNumber+initAsChar);
        System.out.println(""+ init + " "+ initAsNumber + " " + initAsChar);











    }
}
