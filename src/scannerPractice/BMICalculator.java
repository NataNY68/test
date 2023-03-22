package scannerPractice;

import java.util.Scanner;

public class BMICalculator {
    //BMI = weight(kg) / (height(m) * height(m); >> 18 - 24
    // calculate BMI for the user
    public static void main(String[] args) {
        Scanner asd = new Scanner (System.in);
        System.out.println("What is your weight?");
        double weight = asd.nextDouble();
        System.out.println("What is your height?");
        double height = asd.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("Your BMI result is " + bmi);



    }






}
