package RecapWithAhmet.OOP;

public class Polymorphism {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is polymorphism? (poly - many, morphism - forms)
    -->It is a different form of the object

    2-What is dynamic and static polymorphism
    * Dynamic Polymorphism - is all about overriding
    * Static Polymorphism - is all about Overloading (Stable, no action)

    3-What is the difference between Overriding and Overloading? (The most common)

    OVERLOADING:
     1-Overloading needs to be in same class
     2-Overloading methods can have final, static, private
   * 3-Whenever you overload, it checks method signature(Different method signature)
       Methods Signature means: name of the method + Parameter,
                               public void run(int speed)
                               public void run (int speed, String name)

    OVERRIDING:
     1-Overriding needs to in different class or subclass (Extends, Implements)
     2-You can not override final, static, private methods.
     3-Whenever you override, it checks not only Method signature also return type
            It must have same Method Signature

     */


    public void dismiss(int time, int minute, String nameOfTeacher){
        System.out.println("Students are leaving at "+ time + minute+ " with teacher "+nameOfTeacher);
    }

    public void dismiss(int hour, String nameOfTeacher){
        System.out.println("Students are leaving at " + hour + " with teacher " + nameOfTeacher);
    }

    public void dismiss(String date, String nameOfTeacher){
        System.out.println("Hello");
    }
}
