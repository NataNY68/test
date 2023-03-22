package RecapWithAhmet;

public class Constructor {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is constructor and what do you do with it?

    --> Constructor it is a way to initialize instance variable.
    --> it is a way to assign the value for object features (instance variables)

    2-Can you tell me the difference between constructor and method?
    CONSTRUCTOR                                 METHODS:
    -It does not have return type               -Must have return type
    -It must have same name as a class          -It may or may not have same name as a class name

    3-Can you make constructor static, final, private?
    UI --> SINGLETON PATTERN DESIGN --> WE USE CONSTRUCTOR PRIVATE TO PREVENT OTHER CLASSES

    THE ANSWER: You cannot make the constructor static, final or private (Exception - Singleton Pattern Design)

    4-What is the difference between this, this(), super, super() ?
     this --> is a keyword which refers to instance variable or methods of class
     this() --> refers to constructor from SAME CLASS
     super --> is a keyword, which refers to parent instance variables/methods of class
     super() --> refers to the parent class constructor FROM DIFFERENT CLASS
     */

    String brand ="Porsche";
    int wheel = 4;
    int door =2;

    public Constructor(String brand){
        this.brand=brand;
    }

    public Constructor(int door){
        this.door=door;
        System.out.println("I am running");
    }

    public Constructor (String brand, int wheel){
        this(4);
        this.brand = brand;
        this.wheel=wheel;
    }

    public static void main(String[] args) {

        Constructor porsche314 = new Constructor("Porsche314");
        System.out.println(porsche314.brand);

        Constructor example = new Constructor("BMW", 3);
        System.out.println(example.door);
        System.out.println(example.wheel);
    }

}
