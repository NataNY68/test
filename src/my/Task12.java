package my;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {


        //sum67([1, 6, 7, 7]
//        int[] nums = {1, 6, 7, 7};
//
//        int sum = 0;
//        int indexOf7 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 6) {
//                for (int j = i; nums[j] != 7; j++) {
//                    nums[j] = 0;
//                    indexOf7 = j;
//                }
//                nums[indexOf7 + 1] = 0;
//            } else {
//                sum += nums[i];
//
//            }
//        }            System.out.println(sum);

        //post4([2, 4, 1, 2]) → [1, 2]

        int[] nums = {2, 4, 1, 2};

        int size=0;

        for(int i=nums.length-1; i>0 ; i--){
            if(nums[i]==4)
                break;
            size++;
        }
        System.out.println(size);

        int[] arr = new int[size];

        for(int j=0; j<size; j++){
            arr[j]=nums[nums.length - size+j];
        }System.out.println(Arrays.toString(arr));



    }
}
