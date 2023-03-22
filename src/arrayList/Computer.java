package arrayList;

public class Computer {

    String brands;
    double price;
    String color;
    double screenSize;

    public Computer (String brands, double price, String color, double screenSize){
        this.brands=brands;
        this.price=price;
        this.color = color;
        this.screenSize=screenSize;

    }

    public String toString(){
        return "Computer {"+brands+ " - "+price+ " - "+color+"- "+screenSize+" }";
    }






}
