package stringBasics;

public class StringMethods5 {
    public static void main(String[] args) {

        String str ="wednesday";

        String strUpdate = str.replace('e', '*');
        System.out.println(strUpdate);

        String update2 = str.replace("d", "$$");
        System.out.println(update2);

        String update3 = str.replace("day", "-");
        System.out.println(update3);

        String str2 = "    today is          so quite     ";
        String result = str2.trim();
        System.out.println(result);

        //Methods chaining (able to call/use another method after method call)

        int number = str2.trim().replace('t', 'T').substring(2,8).length();
        System.out.println(number);

        //String quote = "   From Zero to HERO   ";

        /*
        - replace zero with "one"
        -make entire string as uppercase
        -remove all spaces
        -get a three letter substring from the end
        -print out whatever you have left with
         */
        String quote = "   From Zero to HERO   ";
        String ans = quote.replace("Zero", "one").toUpperCase().
                replace(" ", "");
        System.out.println(ans);
        String result3 = ans.substring(ans.length()-3 );
        System.out.println(result3);




    }
}
