package oop.abstraction.abstraction1;

public class CampusStudents extends Student{

    public CampusStudents(String name, int id){
        super(name,id);
    }

    public void study() {
        System.out.println("Studying in Campus");
    }
    //Non-abstract class can not have abstract methods
    //public abstract void drink();

    @Override
    public void sleep() {
        System.out.println("Campus students are sleeping for 5 hours");
    }

    public int test1(){
        System.out.println("Campus student are taking test");
        return 6;
    }

    public void playTableTennis(){
        System.out.println("Table tennis");
    }
}
