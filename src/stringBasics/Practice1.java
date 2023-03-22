package stringBasics;

public class Practice1 {
    public static void main(String[] args) {

        String word = "Fluffy";
        System.out.println(word); //Fluffy
        System.out.println(word +5+3); //Fluffy53

        //reassignment

        word = "Test";
        System.out.println(word); //Test

        //COMPOUND ASSIGNMENT

        word += word; //--> word = word + word;
        System.out.println(word); //TestTest

        String text = "1234";
        System.out.println(text + 100); //1234100
        System.out.println(text + word); //1234TestTest --> only one time, while printing
        System.out.println(text);//1234

        text += "5";
        System.out.println(text);//12345

        text += 6;
        System.out.println(text);//123456

        int number = 333;
        text += number;
        System.out.println(text); // 123456333

        String name = "Java" + 111;
        System.out.println(name);

        String lastName = "Selenium" + 't';
        System.out.println(lastName);

        name = "Jenny";
        lastName = "Brown";
        name = name + lastName; // concatenation
        System.out.println(name);//JennyBrown
        System.out.println(lastName); //Brown

        String lunch = new String( "Burger");
        System.out.println(lunch); //Burger

        lunch += " with fries";
        System.out.println(lunch);







    }
}
