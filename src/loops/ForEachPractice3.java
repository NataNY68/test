package loops;

public class ForEachPractice3 {
    public static void main(String[] args) {
        double[] change = {2.34, 4.5, 1.25, 3.40, 1.20};

        // by using the for loop find the total of changes
        double sum = 0;
        for (double name : change){
            sum += name;
        }System.out.println(sum);


        int[] numbers = {1, 2, 3, 5, 6, 7};

        //find the missing number from the given pattern

        for (int i = 0; i < numbers.length-1; i++){
            if (numbers[i+1] - numbers[i]>1){
                System.out.println("Missing number is " + (numbers[i]+1));
            }
        }
//way 2
        int sum1 = 0;
        for(int i = 0; i<=numbers.length-1; i++){
            sum1+=numbers[i];
        }
        int sum2 = 0;
        for (int i= 0; i<=7; i++){
            sum2 +=i;
        }

        System.out.println("Sum1 " + sum1  );
        System.out.println("Sum2 " + sum2);
        System.out.println("Missing number is " +(sum2 - sum1));


    }
}
