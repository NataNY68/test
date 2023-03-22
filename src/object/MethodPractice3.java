package object;

public class MethodPractice3 {

    //create a method that will take an array with some names
    //of veggies
    //this method will generate a message for each veggie as
    // if the veggie name has word green - "this is my most favourite"
    // if the veggie name has not word green - "this is my least  favourite
    //return count of either favourite or non favourite veggie amount
    //make the method static
    //test your method in another class

    public static int veggie(String[] array){
        Dog.bath();

        int count =0;
        for (String name :array) {
            name = name.toLowerCase();

            if (name.contains("green")){
                count++;
                System.out.println(name +
                        " this is my most favourite");
            } else{
                System.out.println(name+
                        " this is my least favourite");
            }
        }
        return count;

    }

    //overload above method veggie to create email address for each,
    //and return those created email as an address

    public static String[] veggie( String[] veggies, int number) {
        String[] emails = new String[veggies.length];
        int index = 0;
        for (String name:veggies) {
            String email = name+"@gmail.com";
            emails[index]=email;
            index++;
        }
        return emails;
    }



}
