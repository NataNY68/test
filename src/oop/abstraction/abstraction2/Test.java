package oop.abstraction.abstraction2;

public class Test {
    public static void main(String[] args) {

        // you cannot create an object from interface
        //CanSwim canSwim = new CnSwim();

        Bird bird = new Bird();
        bird.eat();

        System.out.println(bird.TAIL);

        System.out.println(CanFly.TAIL);
        System.out.println(CanFly.WINGS);

        Dolphin dolphin=new Dolphin();
        dolphin.swim(3);
        System.out.println(dolphin.FIN);
        System.out.println(CanSwim.FIN);

        //is there is  any other way that i can create a Dolphin Object

        CanSwim dolphin2 = new Dolphin();
        dolphin2.swim(5);

        Duck duck = new Duck();
        duck.fly();
        duck.landing(50);
        duck.swim(50);
        System.out.println(duck.TAIL);

        CanFly duck1 = new Duck();
        CanSwim duck2 = new Duck();

        duck1.fly();
        duck2.swim(8);

        System.out.println("=============");
        Duck duck3 = new Duck();
        duck3.run();
    }
}
