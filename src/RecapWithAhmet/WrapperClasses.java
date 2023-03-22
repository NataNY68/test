package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    /*
    POSSIBLY INTERVIEW QUESTIONS:

    1-What is Wrapper Class?
    -->Wrapper Class it is a process to convert data into different forms.


    2-How many ways of wrapper classes do you know?
    Note: avoid using numbers for any options. Like - There are 2 ways doing conversion, or there are 8 types of primitive data

    --> Autoboxing
    Conversion data from Primitive to Object

    --> Unboxing
     Conversion data from Object to Primitive
     NOTE: The reason we use wrapper class is to make a conversion data into format that we need. (Parsing, Object, ..)
     */

    public static void main(String[] args) {

        int number = 4; //primitive
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        System.out.println(numbers.get(0).hashCode());
       // numbers.get(0). //Autoboxing --> Automatically it was converted
        //In here I just added primitive into List and turned by itself into an object type

        //Unboxing: Conversion from Object to primitive

        String str = "1235"; //Object
        int exampleNumber = Integer.parseInt(str); //primitive
        System.out.println(exampleNumber);



    }
}
