package loops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        //print out hours and minutes as follows
        // for the hours from 0 to 12
        // minutes from 0 to 59
        //print out:  hour- 1 : min- 0
        //            hour- 1 : min- 1
        //            ....
        //            hour- 2 : min- 2
        //            hour- 1 :
        //print
        // hour is 30 min
    OUTER:
        for (int hour = 1; hour <12; hour++){
            INNER1:
            for (int min = 0; min<=59; min++){
                INNER2:
                for (int sec = 0; sec <60; sec++){
                    if (sec >20 && sec <40) {
                        continue OUTER;
                    }
                    if (hour<=6){
                        System.out.println("hour- " + hour + " : min- " + min+ " : sec- "+ sec + " AM");

                    }else {
                        System.out.println("hour- " + hour + " : min- " + min+ " : sec- "+ sec + " PM");

                    }

                }
                if (min ==30)
                    break OUTER;

            }
                //break;

            System.out.println("                      ");
        }
    }
}
