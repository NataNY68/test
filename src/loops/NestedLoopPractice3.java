package loops;

public class NestedLoopPractice3 {
    public static void main(String[] args) {

        // print out following message
        //by using switch print names of each month next to the number
        //2020 --> 1 - jan, 2, 3, .. , 12
        //2021 --> 1, 2, 3, .. , 12
        //2022 -->


        for ( int a = 2020; a<=2022;a++ ){
            System.out.print(a+ "--> ");

            for (int b = 1; b<=12; b++){

                    //System.out.print(b+", ");
                switch (b){
                    case 1 : System.out.print(b + " -JAN ");
                    for (int d = 1; d <=30;d++){
                        System.out.print(d+" * ");
                    }
                        break;
                    case 2: System.out.print(b+" -FEB ");
                        break;
                    case 3: System.out.print(b+ " - MAR ");
                        break;
                        case 4: System.out.print(b+ " - APR ");
                        break;
                    case 5: System.out.print(b+ " - MAY ");
                        break;
                    case 6: System.out.print(b+ " - JUN ");
                        break;
                    case 7: System.out.print(b+ " - JUL ");
                        break;
                    case 8: System.out.print(b+ " - AUG ");
                        break;
                    case 9: System.out.print(b+ " - SEP ");
                        break;
                    case 10: System.out.print(b+ " - OCT ");
                        break;
                    case 11: System.out.print(b+ " - NOV ");
                        break;
                    case 12: System.out.print(b+ " - DEC ");
                        break;
                }

            }
            System.out.println();
        }
    }
}
