package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPractice {

    /*
    1-What is the difference between Array and ArrayList
    --> What is ..., ,
    --> What is the purpose of usage
    --> Where do we use it,
    --> How do we use it

    Array - is a storage for the Primitives and Objects
    The purpose of usage: WE can store the data temporarily and use it for different purposes.
    (It is a simple way of storing multiple data at the time)

    ArrayList                                         Array:
    1- Dynamic size                                   1-Fixed size
    2- Storage for only Objects                       2-Primitive and Object
    3- It doesn't have multidimensional form          3-It does have multidimensional form
    4- It has some good method (add, get, size, )     4-It doesn't`have methods, but only one function(length() ).
    5- ArrayList can be manipulable                   5-It is not manipulable, because there is no method.
    6- Syntax is different                            6- Syntax is different
     */


    public static void main(String[] args) {
         int[] numbers = new int[5];
         numbers[0]=1;
         numbers[1]=2; //example of storing primitives into array
         int[] numbers2 = {1,2};
         String[] names = {"Ahmet", "Mehmet", "Mahmut"}; //storing of object into array
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers2));
        List mix = new ArrayList<>();
        mix.add(numbers2[0]);
        //numbers2[0]. no method, it means this is primitive
       // mix.get(0). has Object methods, it stores only objects

       // numbers2[1].replace
        String.valueOf(numbers2[1]).replace('2', '5');

        /*
        Write an implementation that initiliaze int array and find the:
  1-Sum of the even number
  2-SUm of the odd number
  3-Difference between them (the answer shouldn't minus)
  exp: {1,2,3,8,12,65,76,5,22,17} for each:
         */

        int[] arr = {1,2,3,8,12,65,76,5,22,17};
        int sumEven =0;
        int sumOdd = 0;

        for ( int item: arr) {
            if(item%2==0){
                sumEven+=item;
            } else
                sumOdd+=item;
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
        int result = sumEven >= sumOdd ? sumEven-sumOdd : sumOdd-sumEven;
        System.out.println(result);



    }
}
