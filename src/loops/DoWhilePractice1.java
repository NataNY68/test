package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {

        //print out "***" for ten times with the while
        int num = 1 , last = 10;
        while (num <= last){
            System.out.println("***");
            num++;
        }

        //print out "***" for ten times with the do-while loop
        num = 1 ; last = 10;
        do{
            System.out.println("$$$");
            num++;
        }while (num>last);

        int x = 5, y = 20;

        do {
            System.out.println("Hello, it is DO-WHILE");
            y--;
        }while (y>x);


        //-----------------------
        do {
            System.out.println("Hello, it is DO-WHILE  22222");
            y--;
        }while (y>x);



    }
}
