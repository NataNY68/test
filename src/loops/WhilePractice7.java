package loops;

public class WhilePractice7 {
    public static void main(String[] args) {
        //find sum of numbers between 10 and 15

        int num1 = 10;
        int num2 = 15;
        int sum =0;

       while (num1 <= num2){
            sum += num1 ;
            num1++;
       }
        System.out.println("The sum between the numbers 10 and 15 is ---> " +sum );

        //find the sum of even numbers from 0 to 15

        int a = 1;
        int b = 15;
        int total = 0;

        while (a<b){
            if (a%2==0){
                total +=a;
            }
            a++;

        }System.out.println(total);
    }
}
