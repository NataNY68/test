package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice1 {
    public static void main(String[] args) {

        int[][] numbers = new int[4][3];

        numbers[0][0]= 73;
        numbers[0][1] =81;

        System.out.println(Arrays.deepToString(numbers));//[[73, 81, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //store 95 to the last index of third element in the first array

        numbers[2][2]=95;
        System.out.println(Arrays.deepToString(numbers));

        numbers[3][2]=100;
        System.out.println(Arrays.deepToString(numbers));

        numbers[numbers.length-1][numbers[numbers.length-1].length-1]= 111;
        System.out.println(Arrays.deepToString(numbers));

        //add 1000 to each number and print it

        for (int i =0; i<numbers.length ; i++){

            for (int k = 0; k < numbers[i].length; k++)
                System.out.print(numbers[i][k]+1000+" ");
        }

        //[[73, 81, 0], [0, 0, 0], [0, 0, 95], [0, 0, 111]]

        for ( int[] arr : numbers) {
            for ( int number : arr){
                System.out.println(number*1000);
            }
        }






    }
}
