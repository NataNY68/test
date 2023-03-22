package object;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Animal(); // create Animal Object
        System.out.println(animal1);

        System.out.println(animal1.name);
        System.out.println(animal1.age);
        System.out.println(animal1.color);

        animal1.name = "Simba";
        System.out.println(animal1.name);
        animal1.color = "brown";
        System.out.println(animal1.color);
        animal1.age = 2;
        System.out.println(animal1.age);


        //create another object, and initialize all instance variables by
        //using new object
        //print out those new values

        Animal cat = new Animal();
        cat.name = "Cherry";
        cat.color = "grey";
        cat.age = 3;
        System.out.println(cat.name);
        System.out.println(cat.color);
        System.out.println(cat.age);

        System.out.println(  animal1.gender  );

        System.out.println(   cat.gender  );

        cat.gender = "Male";
        System.out.println(cat.gender);

        System.out.println("=========================");

        cat.eat();
        animal1.eat();

        //create a method that will print out all properties
        //of every animal

        cat.allP();
        animal1.allP();

        System.out.println("================");

        Animal dog = new Animal();

        System.out.println(dog.energyLevel);

        dog.eat();

        System.out.println(dog.energyLevel);

        System.out.println("Cats energy is - "+ cat.energyLevel);

        //create one method when an animal runs
        //it will use 20 points of energy,
        //please implement the logic and show final energy level

        cat.run();
        cat.run();
        cat.run();
        cat.eat();

        Shape helper = new Shape();
        helper.perimeterCalculator(12,17);

        //a random number so that we acn add 1000 to it in this class

        Student student = new Student();
        int number= student.hourCreator();
        System.out.println(number+1000);


    }
}
