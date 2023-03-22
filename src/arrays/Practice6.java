package arrays;

public class Practice6 {
    public static void main(String[] args) {
        char [] symbols = {'a', '#' , '1', 'W', '3', '6', '@' };
        //print out only numbers,
        //print out other symbols
        //count digits, letters, symbols
        int i=0;
        int digits = 0, letters = 0, symbol = 0;

        for ( ; i< symbols.length; i++) {
            if (symbols[i] >= '0' && symbols[i] <= '9') {
                digits++;
                System.out.println(symbols[i]);
            } else if (symbols[i] >= 'a' && symbols[i]<= 'z' || symbols[i] >= 'A' && symbols[i]<= 'Z'){
                letters++;
                System.out.println("Letters " +symbols[i]);
            }else {
                symbol++;
                System.out.println("Others " + symbols[i]);
            }
        }
        System.out.println("there are " + digits + " digits ");
        System.out.println("there are " + letters + " letters ");
        System.out.println("there are " + symbol + " symbols ");



    }
}
