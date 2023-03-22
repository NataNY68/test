package object;

import java.util.Arrays;

public class VeggieTest {
    public static void main(String[] args) {
        String[] items = {"red tomatoes", "green tomatoes", "green"};
       int count= MethodPractice3.veggie(items);
        System.out.println(count);


        MethodPractice3 object1 = new MethodPractice3();
        object1.veggie(items);

        String[] product = MethodPractice3.veggie(items,3);
        System.out.println(Arrays.toString(product));
    }
}
