package arrays;

import java.util.Arrays;

public class Practice41 {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};

        System.out.println(numbers.length);//size of array

        System.out.println(numbers[0]); // 4

        System.out.println(Arrays.toString(numbers));
        numbers[1] = 88; //giving a new value to index 1
        System.out.println(Arrays.toString(numbers));

        //  numbers[8] = 111; // ArrayIndexOutOfBoundsException

        // multiply each element by 10, and print our the result

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * 10);
        }

        System.out.println("------------");
        // multiply numbers that are greater than 10 by 100e, and print our the result
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                System.out.println(numbers[i] * 100);
            }
            }
        }
    }


