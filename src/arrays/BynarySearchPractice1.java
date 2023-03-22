package arrays;

import java.util.Arrays;

public class BynarySearchPractice1 {
    public static void main(String[] args) {
        String[] drinks = {"tea", "water", "coffee", "coke"};

        System.out.println(        Arrays.binarySearch(drinks, "water"));

        Arrays.sort(drinks);
        System.out.println(        Arrays.binarySearch(drinks, "water"));

        int[] numbers = {3, 6, 8, 10, 2 ,8, 11};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(        Arrays.binarySearch(numbers, 8));
        System.out.println("======================");
        System.out.println(Arrays.binarySearch(drinks, "orange"));

        String[][] brands = {{"Apple", "Dell","google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"}, {"Google", "Bose", "JBL"}  };
//Arrays.sort(brands);//only to single dimension
        //System.out.println(Arrays.deepToString(brands)); // error




    }
}
