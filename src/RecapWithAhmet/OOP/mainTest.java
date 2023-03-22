package RecapWithAhmet.OOP;

public class mainTest extends AbstractPractice1 {
    public static void main(String[] args) {

        //AbstractPractice1 abstractPractice1 = new AbstractPractice1(); // you can not create an object from Abstract class
        //AbstractPractice1.run();
        //AbstractPractice1.

    }


    @Override
    public void dismiss1() {
        System.out.println("Ahment's class will be dismiss at 1:05 pm");
    }

    @Override
    public void speak() {
        System.out.println("Ahmet is speaking");
    }
}

