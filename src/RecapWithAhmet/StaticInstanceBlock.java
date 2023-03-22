package RecapWithAhmet;

public class StaticInstanceBlock {
    /*
        POSSIBLE INTERVIEW QUESTION:

        1- What is static as a keyword and why do you use it?
        --> Static (as a Keyword) is a way to make the methods accessible
        * WITHOUT CREATING AN OBJECT from that class
        --> The disadvantage of using static keyword "YOU CAN NOT OVERRIDE THE STATIC METHODS"
        SIDE NOTE: You can not override static, final, and private

        2- What is a static block?
         --> It is a block that can be called once (ONE TIME IT WORKED)
         --> It always execute first

        3- What is static as a variable keyword?

        --> It makes the variable belong to the class
        --> It is sharable (common) ==> common for all objects
        --> It can be accessed by other classes without creating an objects. Just with the name of class

        4- What is instance block?

        --> It a block that can be called as many as you have objects.
     */
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.run();
        StaticExample.speak();
        //To be able to call static method I can use just ClassName (System Suggested)
        //StaticExample.age = 32;

        StaticExample ahmet = new StaticExample();
        System.out.println(ahmet.money);//10000
        ahmet.withdrawMoney();
        System.out.println(ahmet.money);//9800

        StaticExample mehmet = new StaticExample();
        mehmet.withdrawMoney(); //9800 --> 9600
        mehmet.withdrawMoney(); //9600 --> 9400
        System.out.println(mehmet.money);

        //3 objects --> instance sout -3 tomes
        //


    }
}
