package oop.inheritance1;

public class Cat extends DomesticAnimal{

    String name;


    public void play() {
        String name = "abc";
        System.out.println( name + " is palying");
    }

    int jump(){
        System.out.println("Cat is jumping");
        return 5;
    }

    //Commenting out private hunt method,
    //since it was having wider access modifier in the
    //parent class. here it is not compiling
    //since we made it private

    //private void hunt(){
     //   System.out.println("Cat is hunting");
    //}

    public DomesticAnimal hunt(){
        return new DomesticAnimal();
    }

}
