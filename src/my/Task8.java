package my;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //int[] nums = {65, 76, 87, 3, 5, 87, 333, 456, 98, 100, 98, 12, 101};

        int len = 13;
        int[] nums = new int[len];

        for(int i = 0; i<len;i++){
            System.out.println("Please enter int for array");
            Scanner s = new Scanner(System.in);
            int temp = s.nextInt();
            nums[i]=temp;
        }
        boolean is = false;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int flag = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    flag++;
                }
                if (i == j && nums[i] == nums[j]) {
                    flag--;
                    }
                }
                if (flag <0) {
                    System.out.print(num + " "   );
                    is = true;
                }  }
        if (!is){
            System.out.println("no");
        }

        }
    }

