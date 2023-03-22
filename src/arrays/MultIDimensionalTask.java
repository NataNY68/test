package arrays;

public class MultIDimensionalTask {
    public static void main(String[] args) {
        String[][] brands = {{"Apple", "Dell","google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"}, {"Google", "Bose", "JBL"}  };
        double [][] prices = {{2500, 1800,400, 1399, 1550.99}, {1100, 800, 599 }, {99.99, 120.99, 89.95}  };

        //show google products which are less than 100.00

        for ( int i = 0; i< brands.length; i++){

            for (int k = 0; k< prices[i].length; k++){

                //System.out.println( brands[i][k] + " is $ " + prices[i][k]);

                if (brands[i][k].equalsIgnoreCase("google") && prices[i][k]<100){
                    System.out.println(brands[i][k] + " is the item from Google with price of $" + prices[i][k]);
                }



            }
        }






    }
}
