package arrayList;

import object.BankAccount;

import java.util.ArrayList;

public class TestComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer("Apple", 1300, "white", 14.5);

        Computer c2 = new Computer("Samsung", 600, "black", 14);

        Computer c3 = new Computer("Sony", 745, "grey", 12.5);

        Computer c4 = new Computer("ASUS", 1589, "red", 15);

        ArrayList <Computer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        //System.out.println(list);

        for (Computer info : list) {
            System.out.println(info);
        }

        //find computers they less than 1000$, and show their brand,cost, and color

        for (Computer info : list){
            if(info.price<1000){
                System.out.println(info.brands + " - " +info.price + " - " + info.color);
            }
        }

        System.out.println("=============");

        System.out.println(comp(list));

        System.out.println(totalCost(list));

        BankAccount account = new BankAccount();
        account.withdraw(totalCost(list));
    }
    //create a method that will get an arraylist as an parameter
    ///this method wil find out computers, that has price more than 1200
    //and screen size is more than 13.5
    //this method will store and return those computers as a new arraylist
    public static ArrayList<Computer> comp(ArrayList <Computer> name){
        ArrayList<Computer> bucket = new ArrayList<>();
        for (Computer info : name){
            if(info.price>1200 && info.screenSize > 13.5){
                bucket.add(info);
            }
        }
        return bucket;
    }


    //find out and tell the total prices of computers
    //create a method to solve this

    public static Double totalCost(ArrayList<Computer> name1){
        double total=0;
        for(Computer item :name1){
            total+=item.price;
        }
        return total;


    }



}
