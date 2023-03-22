package arrays;

public class Practice5 {
    public static void main(String[] args) {

        int[] ages = {21, 23, 27, 27, 23, 27, 30, 35, 34, 18, 38, 19};

        //find the biggest age
        int i = 0;
        int largest =ages[0];
        for (; i < ages.length-1 ; i++) {

            if (largest < ages[i+1]) {
                largest=ages[i+1];
            }

        } System.out.println(largest);


    }
}
