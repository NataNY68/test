package oop.abstraction.abstraction1;

public class Test {
    public static void main(String[] args) {
        OnlineStudents onlineStudents = new OnlineStudents("Ben", 222);
        onlineStudents.watchViaZoom();
        onlineStudents.test1();

        //You cannot create an object from Abstract class
       // Student student = new Student();

        Alia alia = new Alia("Alia", 11);
        System.out.println(alia.id); //1234

        CampusStudents campusStudents = new CampusStudents("Efe", 888);
         campusStudents.playTableTennis();
         campusStudents.test1();
         campusStudents.sleep();







    }
}
