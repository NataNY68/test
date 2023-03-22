package primitives;

public class UnaryOperators1 {
    public static void main(String[] args) {

        int studentNumber = 23;
        System.out.println(studentNumber);//23

        studentNumber++;
        System.out.println(studentNumber);//24

        ++studentNumber;
        System.out.println(studentNumber);//25

        //=================
        System.out.println("==============================");
        System.out.println(studentNumber++); //25
        System.out.println(studentNumber); //26

        System.out.println("==============================");

        System.out.println(++studentNumber);
        System.out.println(studentNumber);

        studentNumber++; //28
        System.out.println(studentNumber); //28

        System.out.println(studentNumber++); //show 28, but the value became 29 behind the scene
        System.out.println(studentNumber);

        //===========================
        System.out.println("DECREMENT");

        int number = 12;

        //PreDecrement
        --number;
        System.out.println(number); //11

        //PostDecrement
        number--;
        System.out.println(number);

        //difference between PRE and POST

        System.out.println(--number); // shows 9 and value is also 9
        System.out.println(number); //9
        System.out.println("+++++");
        System.out.println(number--); // show 9 and value is 8
        System.out.println(number); // shows 8

    }
}
