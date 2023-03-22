package encapsulation;

public class City {

    private long population;
    private String name;
    private boolean isCapital;
    private int zipCode;

    public void setPopulation(long population1){
        population=population1;
    }

    public long getPopulation(){
        return population;
    }

    public void setName(String name1){
        name=name1;
    }

    public String getName(){
        return name;
    }


    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
