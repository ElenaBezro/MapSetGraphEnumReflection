package class1_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", 100);

        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
            System.out.println("Order does not preserved");
        }

        Map<String, Integer> lm = new LinkedHashMap<>();
        lm.put("a", 100);

        for(Map.Entry<String, Integer> entry: lm.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
            System.out.println("Order preserved");
        }

        Map<String, Integer> tm = new TreeMap<>();
        tm.put("a", 100);

        for(Map.Entry<String, Integer> entry: tm.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
            System.out.println("Sorted by key");
        }

    }
}
