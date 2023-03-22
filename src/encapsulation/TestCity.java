package encapsulation;

public class TestCity {
    public static void main(String[] args) {
        City city = new City();
        city.setPopulation(54321);
        System.out.println(city.getPopulation());

        city.setName("Chicago");

    }
}

