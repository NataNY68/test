package groupProject1;

public class Task4 {
    public static void main(String[] args) {
        int hour = 60, day = 24, year = 365;

        int minutes = 567843466;

        int year1 = minutes / (hour*day*year);
        int day1 = minutes % (hour*day*year);
        int day2 = day1/(day*hour);


        System.out.println( minutes + " minutes is approximately " + year1 + " years and " + day2 + " days");
    }
}
