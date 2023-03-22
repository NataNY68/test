package oop.inheritance1;

public class DomesticAnimal extends Animal {

    boolean hasToy;
        String name;

    protected void play(){
        this.name = name;
        System.out.println( name+" is playing");
    }

    int jump(){
        System.out.println(" D is jumping");
        return 7;
    }

    public DomesticAnimal hunt(){
        System.out.println("D is hunting");
        return new DomesticAnimal();
    }


}
