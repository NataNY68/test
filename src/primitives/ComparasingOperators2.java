package primitives;

public class ComparasingOperators2 {
    public static void main(String[] args) {

       // there is an event, if a person is 18 years old or old, he/she can attend the event

        int ageOfPerson = 20;
        int requiredAge = 18;

        boolean canAttend =  ageOfPerson >= requiredAge;
        System.out.println(canAttend); //true

        boolean canAttend1 = requiredAge <= ageOfPerson;
        System.out.println(canAttend1); //true

        //kids, if the age of the child is 12 or less, the child can attend the event

        int kidsAge = 9;
        int requredKidAge = 12;
        boolean kidCanGo = kidsAge <= requredKidAge;
        System.out.println("Can the kid attend? " + kidCanGo);

        //if the age of child is 10, they can not participate

        int childAge = 10, requiredChildAge = 10;
        boolean canChildNotAttend = childAge == requiredChildAge;
        System.out.println("This child can not attent when the age is 10 >>" + canChildNotAttend);
        System.out.println(childAge != requiredChildAge);

    }
}
