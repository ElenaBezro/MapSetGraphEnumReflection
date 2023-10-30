package class1_Map.morning;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String text = "java sdkfjhs java aws dfj aws";
        for(String word: text.split(" ")) {
            int count = wordCountMap.getOrDefault(word, 0) + 1;
            wordCountMap.put(word, count);
        }

        System.out.println(wordCountMap);
    }
}
