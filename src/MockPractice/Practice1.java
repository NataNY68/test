package MockPractice;

public class Practice1 {
    public static void main(String[] args) {
        //second largest number
        int[] arr = {12, 13, 12, 15, 0, -1};
        int secondLargest = 0;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
        }System.out.println(secondLargest);
        System.out.println(largest);

    }
}
