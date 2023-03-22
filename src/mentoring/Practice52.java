package mentoring;

import java.util.ArrayList;

public class Practice52 {

public static boolean div(ArrayList<Integer> list){
    boolean flag = false;
    ArrayList<Integer> list1 = new ArrayList<>();
    for (Integer each: list) {
        if(each%3==0 && each%5==0){
            list1.add(each);
        }
    }
    if (list1.size()>4)
        flag=true;

    return flag;
}






    public static void main(String[] args) {
        int[] arr = {15,30,45,65,31,43,21,98,90,60};
        ArrayList<Integer> list = new ArrayList<>();

        for (int elem:arr) {
            list.add(elem);
        }


        System.out.println(div(list));


    }
}
