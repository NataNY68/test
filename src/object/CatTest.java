package object;

public class CatTest {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Tom";
        tom.color = "black";
        tom.age = 2;

        System.out.println(tom.foodAmount);//20

        tom.foodAmount = 40;
        System.out.println(tom.foodAmount);//40

        tom.sleep();

        Cat cat2 = new Cat();
        cat2.sleep();// NULL IS SLEEPIING

        tom.run();

        System.out.println(tom.run());
        System.out.println("======");

        int number = tom.run();
        System.out.println(number);


        //however many miles tom runs, give him 500 dollar per mile

        System.out.println( tom.run()*500 );

        String message1 = tom.walk("west");
        System.out.println(message1);

        System.out.println(tom.walk("up"));
        //System.out.println(tom.sleep());//method with a return type cannot
        //be called in sout

        tom.setColor("Blue");

        System.out.println( tom.color );

        System.out.println(cat2.color);

        System.out.println( tom.getColor() );

        String colorTom =  tom.getColor();

        System.out.println("===================");

        System.out.println(tom.color    );
        System.out.println(tom.getColor());

        tom.allProperties();
        String info = tom.allProperties();
        System.out.println(info);



        System.out.println(tom.properties());
        tom.abv();

        tom.setAge(5);
        tom.getAge();
        System.out.println("in ten years your age will be "+
                (tom.getAge()+10));




    }
}
