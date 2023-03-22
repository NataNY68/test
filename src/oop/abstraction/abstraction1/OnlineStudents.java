package oop.abstraction.abstraction1;

public class OnlineStudents extends Student{

    public OnlineStudents(String name, int id){
        super("Tim", 1234);
    }

    public void study() {
        System.out.println("Online Student studies");
    }

    public int test1(){
        System.out.println("OnlineStudents Test");
        return   4;
    }

    public int watchViaZoom(){
        System.out.println("Attending via zoom");
        return 4;
    }
}
