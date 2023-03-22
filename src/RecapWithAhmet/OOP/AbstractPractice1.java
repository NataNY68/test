package RecapWithAhmet.OOP;

public abstract class AbstractPractice1 {

    public static String name;

    //public static void run(){
//        System.out.println("Hello I am running");
//    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AbstractPractice1.name=name;
    }

    public abstract void dismiss1();//abstract doesn't have a body

    public abstract void speak();

    public AbstractPractice1(){};
}
