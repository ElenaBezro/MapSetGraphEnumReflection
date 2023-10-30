package class1_Set.morning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
       Set<String> uniqueStrings = new HashSet<>();
       String[] array = {"apple", "banana", "apple", "cherry", "apple", "banana", "apple", "cherry"};

       for (String item: array) {
           uniqueStrings.add(item);
       }

       for (String item: uniqueStrings) {
           System.out.println(item);;
       }
    }
}
