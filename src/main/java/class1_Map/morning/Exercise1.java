package class1_Map.morning;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<Integer, String> studentByIdMap = new HashMap<>();
        studentByIdMap.put(101, "Lena");
        studentByIdMap.put(102, "Lisa");
        studentByIdMap.put(103, "Nona");
        System.out.println(studentByIdMap);

        System.out.println("Student: " + studentByIdMap.get(101));
    }

}
