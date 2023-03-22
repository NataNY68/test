package primitives;

public class Casting {
    public static void main(String[] args) {
        //Implicit  --- smaller to larger
        int num = 23;
        long numl = num;
        System.out.println(numl);

        //explicit

        int count = 25;
        short countSh = (short) count;
        System.out.println(count);
        System.out.println(countSh);

        int number = 130;
        System.out.println("number --> " + number);
        byte numberBt = (byte)number;
        System.out.println("number in the byte type --> " + numberBt);

        double weight =3.4;
        int weight2 = (int)weight;
        System.out.println(weight2);

        int example = (int)25.6;
        System.out.println(example);

        byte b1 = 23, b2= 12;
        byte sum1 = (byte) (b1 + b2);
        short sum2 = (short) (b1 + b2);
        short sum3 = (byte) (b1 + b2);

        //compound assignnment   +=; -=; /=; *=; %=;

        byte result1 = 12;
        result1 += example; // byte + int ==> byte

        example -= 1.2; // int - double (expected double), because of compound assignment java cast it in int
        //as variable example has data type int




    }
}
