package loops;

public class WhilePractice1 {
    public static void main(String[] args) {
        //print "Hello" for 10 times
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        int count = 0;
        while ( count < 10 ) {
            System.out.println(count);
            System.out.println("Hello");

            count++;

        }

        int number = 20;
        int a = 1;

        while (number>10) {
            System.out.println( a + ". Bye");
            a++;
            number--;
        }

        // INFINITE LOOP
//        while (6==6){
//        System.out.println("Java is favorite");
//}

    }
}
