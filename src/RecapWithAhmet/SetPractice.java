package RecapWithAhmet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- How can you make the element unique with collection(American)
    1- What is Set? What is the purpose of using it? (Indian)

    --> In project I was using set to make the element unique, to prevent dublication
    which causes some technical and business issue.
    -->It is a way to store the unique elements only.

    2-Can you tell me the types of collection?
    --> As much as I know, it has been a long time, I didn't use the one of them:
     --> We have List:                     * We have Set:                                         * Queue
        Arraylist and LinkedList          --> HashSet - randomly store the elements (unique)       I am not familiar with this type
                                          --> LinkedHashSet - insertion order
                                          --> TreeSet - ascending order
    3 - Can you explain the difference between Set and List

    --> SET                                         -->LIST
  * -only unique elements (no duplicates)           - it can store duplicate elements
    -It has different sub-types(HashSet, )          - It has sub-types ArrayList, LinkedList
    LinkedHashSet, TreeSet                          - It works mostly indexing
 *** - no indexing in SET

     */
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> numbers2 = new LinkedHashSet<>();
        Set<Integer> numbers3 = new TreeSet<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        System.out.println(numbers); //random

        numbers2.add(1);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(3);
        System.out.println(numbers2); //insertion

        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(2);
        System.out.println(numbers3); //ascending

    }
}
