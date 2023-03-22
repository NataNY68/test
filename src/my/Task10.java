//package my;
//
//import java.util.Arrays;
//
//public class Task10 {
//    public static void main(String[] args) {
//
//        int[] ar1 = {1,1,1,1,1,1,1,1,1};
//        int[] ar2 = {1,1,2};
//        String[] str = new String[ar2.length];
//
//        int count = 0;
//        String flag = "";
//
//        for (int i = 0; i < ar1.length; i++) {
//            boolean is = false;
//            for (int j = 0; j < ar2.length; j++) {
//                if (ar1[i] == ar2[j]) {
//                    str[j] = "" + ar1[i];
//                    break;
//                }
//                if (str[j] == null) {
//                    str[j] = "abc";
//                }
//            }
//        }
//        //Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//        // System.out.println(count);
//
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].length() == 1) {
//                count++;
//                //flag = str[i];
//            }
//        }
//        //System.out.println(count);//2
//
//        // System.out.println(count);
//        int[] arr = new int[count];
//        for (int k = 0; k < arr.length; k++) {
//            arr[k] = Integer.parseInt(str[k]);
//        }
//        System.out.println(Arrays.toString(arr));
//
//        //System.out.println(duplicates(ar1, ar2));
//    }
//
//    public static int[] duplicates(int[] ar1, int[] ar2) {
//
//        String[] str = new String[ar2.length];
//        int count = 0;
//        String flag = "";
//
//        for (int i = 0; i < ar1.length; i++) {
//            boolean is = false;
//            for (int j = 0; j < ar2.length; j++) {
//                if (ar1[i] == ar2[j]) {
//                    str[j] = "" + ar1[i];
//                    break;
//                }
//                if (str[j] == null) {
//                    str[j] = "abc";
//                }
//            }
//        }
//        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].length() == 1) {
//                count++;
//            }
//        }
//
//        int[] arr = new int[count];
//        for (int k = 0; k < arr.length; k++) {
//            arr[k] = Integer.parseInt(str[k]);
//        }
//
//        if (arr.length>0){
//            return arr;
//        }else{
//            return null;
//        }
//
//    }
//}
//
//
//
//
//
//
//
//    /*
//    Create a public method named duplicates that takes
//two int arrays as parameters and returns common elements of both arrays as an int array.
//IF there is no common element of arrays, return null.
//NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
//For example:
// array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]
//
// return int array is [2,3,9] -> !!array is sorted
//     */
//
//
//
//
//
//
