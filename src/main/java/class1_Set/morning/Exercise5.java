package class1_Set.morning;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9));
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println("union");
        Set<Integer> union = new HashSet<>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println(union);

        System.out.println("intersection");
        Set<Integer> intersection = new HashSet<>();
        intersection.addAll(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);

        System.out.println("difference");
        Set<Integer> difference = new HashSet<>();
        difference.addAll(setA);
        difference.removeAll(setB);
        System.out.println(difference);
    }
}
