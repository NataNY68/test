package RecapWithAhmet;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    /*
    POSSIBLE INTERVIEW QUESTION:

    1-Can you tell me about map, and why do you use it?
    --> Map ia an awesome interface to be used in my project to share/store my data as 'key' and 'value'

    2- What is the connection between Collection and Map?
    --> They are all useful that I use in my project for different purposes.
    As I mentioned before SET is all about uniqueness
                          LIST is all about duplication
                          MAP is all about KEY and VALUE
    SHOW OFF: did you know that there is a good explanation for the connection
    that I realised when I was working on Map, I checked the feature of KEY and feature of VALUE.
    KEY  acts like the Set Feature, it means it only accept the Unique Data
    VALUE acts like the List Feature, it means it only accept duplicates as well

    3-What is the type of Map and difference between them?

    To be honest, I didn't like the map at the beginning, it seemed so complicated,
    but after I learned the beauty of sub-types which are:

      -HashMap - it stores randomly
      -LinkedMap - it stores insertion
      -TreeMap - is my favourite to do ascending order

    4- Synchronization? Can you give examples and what do you know about it usage in Java?

    --> First come First serve   --> In automation --> Wait times
    * --> it execute any actions one by one (one after another)
    * --> we have two most common concepts in Java Synchronization
        --> HASHTABLE       --> STRING BUFFER
        **** Synchronized system is THREAD-SAFE, so it is SLOWER *****
        HashTable, String Buffer

        **** Non-Synchronized system is NOT THREAD-SAFE, is FASTER
             --> List, Map, Set, StringBuilder

     */

    public synchronized void run(){
        System.out.println("hello");
    }

    public void run2(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        /*
        String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
TASK:I want you get the outpu of totall item for each:
-->Apple=3,Banana=2,Orange=2,Strawberry=1,Cherry=1
TIPS:You can use a method(map) containsKey
TIPS:If condition
         */

        String[]fruits ={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Apple","Cherry","Orange"};
        Map<String, Integer> map = new HashMap<>();
        //int i = 1;

        for( String key: fruits ){
            Integer res = map.containsKey(key) ? map.put(key, map.get(key) + 1) : map.put(key, 1);
        }
        System.out.println(map);
        map.clear();

        for (String key : fruits) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key)+1);
            }
        }
        System.out.println(map);



    }

}
