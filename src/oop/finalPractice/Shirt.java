package oop.finalPractice;

public class Shirt {

   final double PRICE = 11.99;
    String color;
    String size;

    public void sale(){
        System.out.println("SALE!");
    }

    final public void dye(){
        System.out.println("Changing color of Shirt");
    }

    final public void dye(String color){
        System.out.println("Changing color of Shirt to the " + color);
    }

    @Override
    protected void finalize()  {
        System.out.println("++++");;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "PRICE=" + PRICE +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
