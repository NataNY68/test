package oop.abstraction.abstraction2;

public class Bird implements CanFly{

    public void fly(){
        System.out.println("Bird is in the air");
    }

    public void landing(double speed){
        System.out.println("Bird is landing with a speed of" + speed);
    }

    protected void eat(){
        System.out.println("Birds eat");
    }

    public void abcd(){
        System.out.println("    $$$$$   ");
    }





}
