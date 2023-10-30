package class1_Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        a.addAll(Arrays.asList(1,3,4,5,6));
        b.addAll(Arrays.asList(4,5,6,7,8,9));

        //addition
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        //interception
        Set<Integer> interception = new HashSet<>(a);
        interception.retainAll(b);
        System.out.println(interception);

        //difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);

        //HashSet = Does not preserve the order of the elements
        //LinkedHashSet = preserve the order of the elements
        //TreeSet = sort elements
    }
}
