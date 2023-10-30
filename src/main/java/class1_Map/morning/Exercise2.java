package class1_Map.morning;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        Map<Integer, String> studentByIdMap = new HashMap<>();
        studentByIdMap.put(101, "Lena");
        studentByIdMap.put(102, "Lisa");
        studentByIdMap.put(103, "Nona");
        System.out.println(studentByIdMap);

        for(Map.Entry entry: studentByIdMap.entrySet()) {
            System.out.println("Student id: " + entry.getKey() +  ", name: " + entry.getValue());
        }
    }
}
