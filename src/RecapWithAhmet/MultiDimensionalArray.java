package RecapWithAhmet;

public class MultiDimensionalArray {
    /*
    There is no specific question regarding that, other than difference between array and ArrayList

    --> IN AUTOMATION WE WILL HAVE MORE DETAILS REGARDING HOW TO USE

     */

    public static void main(String[] args) {
        String[][] names={  {"Ahmet"}, {"Mehmet"}, {"Mahmut"}, {"Ahmet", "Mehmet", "Mahmut"}  };
        System.out.println(names[0][0]);
        System.out.println(names[1][0]);
        System.out.println(names[0][3]);
        System.out.println(names[3][2]);

    }

}
