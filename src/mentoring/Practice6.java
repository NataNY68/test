package mentoring;

public class Practice6 {
    public static void main(String[] args) {
        //print out first 5 odd Fibonacci numbers

        int a=-1;
        int b=1;
        int c;
        int count=0;

        while(count<5){
            c=a+b;
            a=b;
            b=c;
            if (c % 2 == 1) {
                System.out.println(c+" ");
                count++;
            }
        }

    }
}
