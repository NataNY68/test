package RecapWithAhmet;

public class StringBuilderPractice {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1- What is the difference between String and StringBuilder?

    They are both useful for my project in terms of Mutability and Immutability
    -> String is immutable
    -> StringBuilder is immutable
    -> StringBuilder has some different methods --> append, reverse, ...

    2- What is the difference between StringBuilder and String Buffer?

    --> String Buffer and HashTable are both synchronized
    --> Map, List, Set, String, StringBuilder are non-synchronized


   NOTE:
   1. Mutable is all about giving function/action/manipulation without 're-assigning' the value
   2. Immutable is all about the giving function/action/manipulation with 're-assigning' the value.
   3. PassByValue and PassByReference is all about the way that you pass the data
     --> if you call the method and pass the value directly/ initializing
     (StringBuilderrecap.run("Ahmet")) --> it means you are passing the value --> PASSBYVALUE

     -->if you call the method and pass the value with a reference
     String name - "Ahmet";
     Stringbuilderrecap.run(name); --> PASSBYREFERENCE

     */

    public static void main(String[] args) {

       //Immutability:
        String name = "Ahmet";
        name.replace("m", "*").concat("Loves").concat("Java    ").trim();
        System.out.println(name);

        //Mutability:
        StringBuilder builder = new StringBuilder("Ahmet");
        builder.replace(2,3,"*").append("Loves").append("Java   ").trimToSize();
        System.out.println(builder);

        System.out.println(builder.reverse());

        StringBuffer stringBuffer = new StringBuffer();


    }
}
