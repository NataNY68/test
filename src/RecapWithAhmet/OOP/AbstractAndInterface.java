package RecapWithAhmet.OOP;

public class AbstractAndInterface {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is abstract? And can you clarify it with a little details?
    --> Abstract is a way to organize the methods with ONLY NECESSARY information
    (template), you do not have body for abstract methods. It means people can see the
    template of the methods and 'OVERRIDE' this based on their requirements

    NOTE: We do not have a body for abstract methods because every class extends to the
    abstract class can MAKE THEIR OWN IMPLEMENTATION.

    2-Why do you need to have abstract class in your project?
    * For many methods we need developers to make their own implementations to reduce
    the amount of duplication in the project which cause memory slowness, system slowness,
    more execution for system.

    3-Where do you use abstract class in your project?
    I would definitely say, i use general OOP concept in everywhere of my project. In
    automation script I do not use too much,but I know that my team developers are using.

    4-Can you create an object from abstract class? If no, how are you going to access
    all the methods  and variables from that class?
    NO, you can not create an object from Abstract class. To be able to access these methods
    and variables you need to override them. (Extends from parent to child)

    5-Can you have normal and abstract method inside the abstract class?
    Yes, you can have both of the method types inside the Abstract class.


    INTERFACE:

    1-What is interface?
    --> Interface is a blueprint of the class, which has special methods, that can
    be overridden to make new implementation in subclass.

    --> We use 'IMPLEMENT' keyword, to make the class connected with the INTERFACE

    2-Why do you need interface, if you have abstract?
    -->Because interface has more features in terms of accessing the multiple parents
     at the same time by overriding

    3-What is the difference between interface and abstract? (*****)

    INTERFACE:
    1-Interface is declared with 'interface' keyword
    2-Interface can have only public abstract methods
    (SHOW OFF: default keyword --> exception)
    3-To make a connection, we use 'IMPLEMENTS' keyword
*** 4-In interface you  an implement the class as many as you want parents
      and once you can use extends but it should come before implements
    5-When you initialize a variable in interface, as default it is "final static"
    6-Methods must be as default "public abstract"
    7-Interface can not have constructor


    ABSTRACT:
    1-Abstract is declared with 'abstract' keyword
    2-Abstract may or may not have regular methods
    3-To make a connection, we use 'EXTENDS' keyword
    4-In abstract you can extend the class ONCE (one extends per class)
    5-When you declare a variable in abstract there is no default keyword
    6-You can have any access modifiers for this. (no default keyword )
    7-Can have constructor
     */

}
