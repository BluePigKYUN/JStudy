import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> answer = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            answer.put(length, answer.getOrDefault(length, 0) + 1);
        }

        int maxSize = 0;
        for (int size : answer.values()) {
            if (size > maxSize) {
                maxSize = size;
            }
        }

        return maxSize;
    }
}