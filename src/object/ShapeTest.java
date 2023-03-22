package object;

public class ShapeTest {
    public static void main(String[] args) {

        Shape shape1 = new Shape();

        shape1.perimeterCalculator(5,8);
        shape1.perimeterCalculator(12,20);

        shape1.areaTriangle(4,8);
        shape1.areaTriangle(10,5);

        Shape a = new Shape();
        a.perimeterCalculator(3, 9);
        a.areaTriangle(6,13);
    }
}
