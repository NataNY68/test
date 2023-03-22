package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        //create an ArrayList and store 6 car brands
        //print out brand of every car  from the list one by one
        // [a,b,c,d,e,f]
        //a@yahoo.com


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Ferrary");

        for(String name: cars ){
            System.out.println(name+"@yahoo.com");
        }

        System.out.println("=======================");

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i)+"@gmail.com");
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("bread");
        list.add("oil");
        list.add("yogurt");
        list.add("bananas");
        list.add("apricot");
        System.out.println(list);

        //create a method that will take an arraylist as parameter
        //parameter arraylist should hold String type elements
        //that method will show only elements which have letter 'a' in it
        System.out.println("==========");

        filter(list);
    }

    public static void filter(ArrayList<String> list){
        for (String item: list) {
            if(item.contains("a")){
                System.out.println(item);
            }
        }
    }



}
