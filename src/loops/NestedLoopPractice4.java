package loops;

public class NestedLoopPractice4 {
    public static void main(String[] args) {
        //create multiplication table for number 1 to 5
       // 1*1 = 1
        //1*10=10

        for (int num1 =1  ; num1 <=5; num1++){

            for (int num2 = 1 ;num2 <=10 ; num2++){
                System.out.println(num1 + "*" + num2 + " = " + num1*num2);

            }
            System.out.println();
        }
    }
}
