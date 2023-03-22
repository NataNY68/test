package RecapWithAhmet;

public class StaticExample {
public static int money = 10000;
public static int weight = 210;

    public static void speak(){
        System.out.println("Ahmet is speaking");
    }

    public void run(){
        System.out.println("Ahmet is running");
    }

    public void withdrawMoney(){
        money-=200;
        System.out.println("Good job! You are getting younger");
    }

    static {
        //this will no matter what execute first
        System.out.println("Hey, I am a static block" +
                " please let me go first");
    }

    {
        //this will come after static block

        System.out.println("Hey, I am instance block");
    }

}
