package loops;

public class WhilePractice2 {
    public static void main(String[] args) {
        /*
        from the age 18 to 25 inclusive:
                "My age is..., "
         */

        int age = 18;
        while (age <=25) {
            System.out.println("My age is " + age);
            age++;
        }
        //print out number between 30 to 45 inclusive

        int num = 30;
        while (num <=45) {
            System.out.println("Number " + num++);

        }


    }
}
