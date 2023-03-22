package primitives;

public class UnaryOperators2 {
    public static void main(String[] args) {

        double d = 8.7;
        d++;
        System.out.println(d);

        int a = 5;
        int b = ++a; //6
        int c = a+ ++b; // 5+7
        //c?
        System.out.println(b);

        System.out.println("c is >> " + c);//13

        c = ++c + --a - 2;

        System.out.println("c is >> " + c);

        int e = c+10;
        System.out.println(e);

        int k = 8, t = ++k, m = k + t, x = ++m;

        System.out.println(--x - --k); //10

        //=========deal on dUNKIN Donuts

        /*
        get one dozen for 15 $ of donuts you get one dollar discount on your next purchase
        show next purchase
         */
        int payment = 15;
        System.out.println(payment--); // today 15$ (shows 15, value 14)
        System.out.println("next payment " + payment);

        /*
        get one dozen for 15 $ of donuts you get one dollar discount on your payment now
         */
         int payment1 = 15;
        System.out.println(--payment1 + " $ payment now with applied discount");
    }
}
