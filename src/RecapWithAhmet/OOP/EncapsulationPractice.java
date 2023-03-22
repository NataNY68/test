package RecapWithAhmet.OOP;

public class EncapsulationPractice {

    private String name = "Ahmet";
    private int age = 31;
    private long creditCard=123455684;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
