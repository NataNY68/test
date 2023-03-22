package oop.inheritance4;

public class Book {
    static int pageCount=101;
    String title;
    String kind;

    public int getPageCount(){
        return pageCount;
    }

    public Book(int pageCount, String title, String kind){
        this.pageCount = pageCount;
        this.title = title;
        this.kind = kind;
    }

    //static methods will be hidden from Child class, you cannot override it
    public static void read(){

        System.out.println("Reading book");
    }

}
