package mapPractice;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfoTask {

    /*
            FirstName: David
            LastName: Pena
            Age: 25
            Gender: M
            City: Chicago

            FirstName: Jeremiah
            LastName: Michaelson
            Age: 15
            Gender: M
            City: LakeForest

            FirstName: Michael
            LastName: White
            Age: 35
            Gender: M
            City: Winnetka

            FirstName: Sarah
            LastName: Star
            Age: 29
            Gender: F
            City: Chicago

     */

    //store students information into maps
    //store those students information into list
    ////from list of students  find out city of the student
    //if student lives out of chicago, tell that student -- > you can join online

    public static void main(String[] args) {
        HashMap<String, String> s1 = new HashMap<>();
        s1.put("FirstName","David" );
        s1.put("LastName", "Pena");
        s1.put("Age", "25");
        s1.put("Gender", "M");
        s1.put("City", "Chicago");

        HashMap<String, String> s2 = new HashMap<>();
        s2.put("FirstName","Jeremiah" );
        s2.put("LastName", "Michaelson");
        s2.put("Age", "15");
        s2.put("Gender", "M");
        s2.put("City", "LakeForest");

        HashMap<String, String> s3 = new HashMap<>();
        s3.put("FirstName","Michael" );
        s3.put("LastName", "White");
        s3.put("Age", "35");
        s3.put("Gender", "M");
        s3.put("City", "Winnetka");

        HashMap<String, String> s4 = new HashMap<>();
        s4.put("FirstName","Sarah" );
        s4.put("LastName", "Star");
        s4.put("Age", "29");
        s4.put("Gender", "F");
        s4.put("City", "Chicago");

        List<HashMap<String, String >> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println(students);

        for (HashMap<String, String> studentInfo : students) {

           System.out.println(studentInfo.get("FirstName")+" - "+studentInfo.get("City"));

            if (!studentInfo.get("City").equalsIgnoreCase("Chicago")){
                System.out.println( studentInfo.get("FirstName")+"- You can join online");
            }
           }

        for (int i = 0; i < students.size(); i++) {

            if (!students.get(i).get("City").equalsIgnoreCase("Chicago")){
                System.out.println(students.get(i).get("FirstName")+"  *** You can join online  ***");
            }
        }

        List<List <String >> result1 = fullNameFinder(students);
        HashMap <String , List> result2 =  fullNameFinder1(students);

        //find the city which is Winnetka - you are lucky

        for (Object city  :result2.get("Cities")){
            if (city.toString().equalsIgnoreCase("winnetka")){
                System.out.println( " You are lucky since you are in " + city);
            }

            //can we find students who are age of 30 or younger and they are from Chicago
            //System.out.println("NEW TASK");



        }
        for ( HashMap<String,String> info1: students) {
            if (Integer.parseInt(info1.get("Age"))<=30 && info1.get("City").equalsIgnoreCase("chicago")) {
                System.out.println(info1.get("FirstName") + " are age less than 30 and from Chicago");
            }
        }




    }

    //create a method
    // pass a parameter as list
    //return all student first and last names as an separate List

    public static List<List<String >> fullNameFinder(List<HashMap<String, String>> info){
        List<String > firstN = new ArrayList<>();
        List<String > lastN = new ArrayList<>();
        //create another list bucket
        List<List<String >> list = new ArrayList<>();

        for (HashMap<String, String> studentNames : info){
            firstN.add(studentNames.get("FirstName"));
            lastN.add(studentNames.get("LastName"));
            }
        list.add(firstN);
        list.add(lastN);
        System.out.println(list);

        return list;


    }

    public static HashMap<String,List > fullNameFinder1(List<HashMap<String, String>> info){
        List<String > firstN = new ArrayList<>();
        List<String > lastN = new ArrayList<>();
        //create anothe list for cities
        List<String > cities = new ArrayList<>();
        HashMap<String, List> map1= new HashMap<>() ;

        for (HashMap<String, String> studentInfo : info){
            //find and add city to the list cities
            firstN.add(studentInfo.get("FirstName"));
            lastN.add(studentInfo.get("LastName"));
            cities.add(studentInfo.get("City"));
        }
        //add list to map1
        map1.put("FirstNames", firstN);
        map1.put("LastNames", lastN);
        map1.put("Cities", cities);
        System.out.println(map1);

        return map1;
    }

}
