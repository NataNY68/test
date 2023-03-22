package loops;

public class DoWhilePractice4 {
    public static void main(String[] args) {
        //String = "@$%SdvH&S345";
        //count the number of letters --> 5
        //count the number of digits --> 3
        //count the number of other symbols --> 4
        //
        String str = "@$%SdvH&S345";
        int index = 0;
        int letterCounter = 0, digitCounter = 0, symbolCounter = 0;

        do {
            char ch = str.charAt(index);
            if (ch >='a' && ch <='z' || ch >='A' && ch <= 'Z'){
                letterCounter++;
            } else if (ch >='0' && ch <= '9') {
              digitCounter++;
            } else {
            symbolCounter++;
            }
            index++;

        }while (index < str.length());
        System.out.println("Letters --> " + letterCounter );
        System.out.println("Digits --> " + digitCounter);
        System.out.println("Symbols --> " + symbolCounter);

        // String sentence = "I can do it on my own this time"
        //find letters 'o' and 'O' and count it

        String sentence = "I can do it on my own this time";

        int count = 0;
        int upperO = 0;
        int indexOfLetterO = 0;

        do {
            char cha = sentence.charAt(indexOfLetterO);
            if (cha == 'o' || cha == 'O'){
                count++;
            }

            indexOfLetterO++;

        }while (indexOfLetterO < sentence.length());
        System.out.println("The number of letter 'o' and 'O' --> " +count);




    }
}
