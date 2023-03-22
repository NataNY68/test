package object;

import java.util.Scanner;

public class MethodsPractice2 {
    public static void main(String[] args) {

        MethodsPractice2 john = new MethodsPractice2();
        double call1 = john.test1(3.2, 1.8, "multiplication");
        System.out.println(call1);

       double call2 = john.test1(4, 4.5, "addition");
        System.out.println(call2);

        john.ageCalculator(1996, 2022);
        System.out.println( john.ageCalculator(1996, 2022));

        int x = john.ageCalculator();
        int z = john.ageCalculator(2000);
        short a = 2022;
        john.ageCalculator(a);



    }



    //create a method that will take two double numbers, and an operation name
    //this method will return result
    //*operation --> addition or multiplication

    public double test1(double num1, double num2, String operationName ){

        if(operationName.equalsIgnoreCase("addition")){
           double result = num1+num2;
           return result;
        }else {
            double result = num1*num2;
            return result;
        }
    }

    //create a method that will find out your age
    //return and the age

    public int ageCalculator(int yearBirth, int currentYear){
        int age1 = currentYear - yearBirth;
        System.out.println("your age is "+age1);
        return age1;
    }

    public short ageCalculator(int birthYear){
        short age = (short) (2022 - birthYear);
        System.out.println("your age is "+age);
        return age;

    }

    public int ageCalculator(){

        int age = 2022 - 2003;
        System.out.println("your age is "+age);
        return age;

    }

    public int ageCalculator(short currentYear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int yearBirth = scanner.nextInt();

        int age = currentYear - yearBirth;
        System.out.println("your age is "+age);


        return age;
    }






}
