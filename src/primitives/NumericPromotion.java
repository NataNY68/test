package primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte b1 = 6;
        byte b2 = 3;

        // byte sum = b1 + b2;  --> compile time error

        int sum1 = b1 + b2;
        System.out.println(sum1);

        double d1 = 2.3;
        int i1 = 3;

        double result = d1 * i1; // java automatically promotes two decimal numeric data type, which is double
        System.out.println(result);

        short sh2 = 45;
        long l1 = 9;
        long result1 = sh2 - l1;

        float fl1 = 9.0f;
       double result5 =  fl1 + d1;
        System.out.println(result5);

    }
}
