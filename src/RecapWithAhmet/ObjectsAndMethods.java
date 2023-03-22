package RecapWithAhmet;

public class ObjectsAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What do you know about Object, tell me couple methods of it?
    --> Always go general to deep

    -->Object is the representation of the class (blueprint).
    --> There are some useful methods of objects that I usd t perform some actions in my project
    Methods: actions, behaviour
    * .equals --> Comparison of two objects values
    * toString --> It is a way to make the data into String format. (Arrays.toString())
    * HashCode --> it gives you the location of data

    2-What is the difference between Object and Class?

     Class: is a blueprint/ template of the object which you can create as many as you want.
     Object: is a representation of the class/member -> Instance of a Class (Instance=Object)
     Class: It is declared with 'class' keyword.
     Object: It is declared with 'new' keyword.

    3-How do you initialize the instance variables?

    There some common ways to initialize the instance variables:

    --> Constructor - can be overloaded, but not overridden
    --> Methods (getters and methods)
    --> Objects
    --> Directly declare and initialize

    4-What is the difference between the local and instance variables:

    Instance Variable:                                    Local Variable:
    -Belongs to class                                     -It belongs to block
    -It has default values(null, 0, false, ..)            -No default values
    -It can have Access Modifiers (private, public        -Can not have access modifier
     protected, default (it is not a keyword))
     */

    String name = "Ahmet";
    int age = 31;
    String eyeColor = "black";
    String nationality;

    public ObjectsAndMethods(String name, int age, String eyeColor, String nationality) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public void run(int speed){
        int number=1;//local variables cannot have default values, you have to initialize it
        //public int number =5; == ypu can not use access modifier for local variables
        System.out.println(number);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        ObjectsAndMethods maleHuman = new ObjectsAndMethods("Mehmet", 35, "brown", "Kyrgyz"); // object --> representation of class
                                                                //Instance of class
        System.out.println(maleHuman.name);
        System.out.println(maleHuman.age); //31
        maleHuman.age =32;
        System.out.println(maleHuman.age); //32

        System.out.println(maleHuman.nationality); //null
        maleHuman.nationality = "Turkey";
        System.out.println(maleHuman.nationality); //Turkey

        //System.out.println(maleHuman.number);  there is no direct call for local variables



    }



}
