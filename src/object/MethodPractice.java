package object;

public class MethodPractice {

    //create a method that will add two int numbers together and return the sum

    public int sumCalculator(int num1, int num2){

        int sum = num1+num2;
        System.out.println("Two int parameters method is running");
        return sum;

        //return num1+num2;
    }

    public int sumaCalculator(int num1, int num2, int num3){

        int sum = num1+num2+num3;
        System.out.println("Three int parameters method is running");
        return sum;
    }

    public int sumCalculator(int[] numbers){

        int sum =0;

        for(int num: numbers){
           sum=sum+num;
        }
        return sum;

    }
    //overload sumCalculator method to find sum of numbers from a given array

    public static void main(String[] args) {
        MethodPractice object = new MethodPractice();

        int total1= object.sumCalculator(3,5);
        System.out.println(">>>>>>> "+total1);

        int total2 = object.sumaCalculator(3, 34, 11);
        System.out.println(total2);
        int[] arr = {2,5,2,3,1,6,9};
       int total3 =  object.sumCalculator(arr);
        System.out.println(total3);

        System.out.println(object.sumCalculator(new int[]{3,4,5}) );
    }



}
