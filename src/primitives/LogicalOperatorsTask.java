package primitives;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        /*TASK: Create a class in intellij to solve:
	you need to have average of 60 percent to pass the class
		when you get 3 tests
		UUR RANGE FOR TEST SCORES IS 0 TO 100
	AND
		you need to have 90 % attendance
         */

        int test1 = 90, test2 = 70, test3 = 80;
        int average = (test1 +test2+test3)/3;
        int requredAverage = 60;
        int myAttendance = 89;
        int requredAttendance =90;

        boolean result = average >=requredAverage && myAttendance >= requredAttendance;
        System.out.println(result);



    }
}
