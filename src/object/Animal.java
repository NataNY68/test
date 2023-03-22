package object;

public class Animal {

//instance variables, instance variables define/belong the object
    String name;
    String color;
    int age;
    int energyLevel;

    String gender = "Female";

    public void eat(){
        energyLevel = 100;

        System.out.println("Energy level is "+ energyLevel+
                " after eating");
        System.out.println(name + " is eating");
    }

    public void run(){
        energyLevel-=20;
        System.out.println(name + "`s final energy is "+ energyLevel);
    }

    public void allP(){

        System.out.println(name + " - " + age + " - "+ color +" - "
        +gender+ " - ");
    }

}
