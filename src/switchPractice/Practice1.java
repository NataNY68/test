package switchPractice;

public class Practice1 {
    public static void main(String[] args) {

        int count = 5;

        switch ( count ){

            case 5 : { // curly brackets are  not necessary, it is just for user to match the case


                System.out.println("RED");
                System.out.println("red");
                System.out.println("ReD");
                int number = 9;
                System.out.println(number * number);
            } break;
            case 2 :
                System.out.println("Yellow");
                break;
            case 1 :
                System.out.println("White");
                break;
            case 10 :
                System.out.println("PINK");
                break;
            default:
                System.out.println("NO COLOR");
                break;







        }
        System.out.println("this is the end of the switch statement");




    }
}
