package groupProject2;

public class Task2 {
    public static void main(String[] args) {
        int number = 12345;
        int a5 = number % 10; // a5 = 6;

        int b1 = number / 10; //5387
        int a4 = b1 % 10; // a4 = 7

        int b2 = b1 / 10; //538
        int a3 = b2 % 10; //a3 = 8

        int b3 = b2 / 10; //53
        int a2 = b3 % 10; //a2 = 3

        int b4 = b3 / 10; //5
        int a1 = b4 % 10; //a1 = 5

        int reverse = a5*10000 + a4*1000 + a3*100 + a2*10 + a1*1;
        System.out.println(reverse);

 //////////////////////////////////////////
        String givenNumber1 = "53876";
        String first = givenNumber1.substring(0, 1);
        String second = givenNumber1.substring(1, 2);
        String third = givenNumber1.substring(2, 3);
        String fourth = givenNumber1.substring(3, 4);
        String fifth = givenNumber1.substring(4, 5);
        String result = fifth.concat(fourth).concat(third).concat(second).concat(first);
        String name = "Nataliia";
        String space = " ";
        String lastN = "Yatsyshyn";
        String total = name.concat(space).concat(lastN);
        System.out.println("+++" + total);
        System.out.println("the result is " + result);


        String words = "   Hello my name is Bob    ";
        System.out.println(words.length() + " length ");
        System.out.println(words);
        System.out.println(words.trim());
        System.out.println(words.trim().length());
        String substr = words.substring(0, 1);
        System.out.println(substr);
        int indexA = name.indexOf("a");
        System.out.println("----------");
        System.out.println(name.indexOf("a", indexA + 1));
    }
}
