package oop.abstraction.abstraction2;

public interface CanFly {

    int TAIL = 1;
    int WINGS = 2;

    void fly();

    void landing(double speed);

    //all methods and variables are public, static and abstract

    //here default is not an access modifier, it is just a keyword
    public default void printInfo(){
        System.out.println(this.TAIL + "   ---   "+this.WINGS);
    }

    private void abcd(){
        System.out.println(" +++  ");
    }



}
