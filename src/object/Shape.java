package object;

public class Shape {


    //calculate perimeter of rectangle
    // width, length 2*(w+l)

    //int w = 5, l=10, p = 0;

    public void perimeterCalculator (int width, int length ){

        int perimeter = 2*(width + length);

        System.out.println("The perimeter of rectangle is "+ perimeter);

    }
    //create the method that will calculate area of a triangle

    public void areaTriangle (int base, int height){

        int area = (base*height)/2;
        System.out.println("Area of a triangle is " + area);
    }


}
