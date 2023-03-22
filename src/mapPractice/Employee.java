package mapPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Employee {
    public static void main(String[] args) {


    }
    /*
-create an employee class with instance variables of name, city, age, id
-create one constructor to initialize instance variables
-create a method to generate random  employee id and use this id for employee

-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids as key
-create a method to print only employee names from map
     */

    String name;
    String city;
    Integer age;
    Integer id;

    public Employee(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public Integer idGenerator (){
        Random random = new Random();
        return random.nextInt(100000);
    }

}


