package class1_Map.morning;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("Russia", "Moscow");
        capitalMap.put("Canada", "Toronto");
        capitalMap.put("Lapland", "Bruru");
        System.out.println(capitalMap);

        for(Map.Entry entry: capitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() +  ", Capital: " + entry.getValue());
        }
    }
}
