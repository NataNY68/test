package aModifier;

public class Child extends Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.ageProtected = 8;
        animal.namePublic = "Jerry2";
        animal.colorDefault = "red";

        Child child = new Child();
        child.colorDefault = "Red/White;";
        child.ageProtected = 3;
        child.namePublic = "Jr Jerry";


    }

}
