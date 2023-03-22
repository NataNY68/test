package arrayList;

import object.Bottle;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {

        //create an arraylist, and store some bottle object
        //and manipulate object from the arraylist

        ArrayList <Bottle> list = new ArrayList<>();

        Bottle b1 = new Bottle(6);
        Bottle b2 = new Bottle(16);
        Bottle b3 = new Bottle(26);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        System.out.println(list);

        System.out.println(list.get(0).size);
        System.out.println(list.get(1).liquidAmount);//

        //compare and find differences between b1 and b2 sizes

        System.out.println(list.get(1).size - list.get(0).size);

        //check the list and see ifn any bottle size is more than 10
        // print that the bottle is a large bottle

        for (Bottle item : list){
            if(item.size>10){
                System.out.println(item.size + " this bottle is a LARGE bottle");
            }
        }

        //create a Computer class under Arraylist package
        //have instance fields:
        //brand, price, color, screenSize
        //create one constructor to initialize all instance variables
        //create a Test class
        //inside of the Test class, store 4 computer object in an Arraylist
        //show properties of each computer from the list




    }
}
