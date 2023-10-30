package class1_Set.morning;

import java.util.Set;
import java.util.TreeSet;

public class Exercise3 {
    public static void main(String[] args) {
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(4);
        sortedSet.add(7);
        sortedSet.add(10);
        sortedSet.add(1);

        for (Integer number: sortedSet) {
            System.out.println(number);
        }
    }
}
