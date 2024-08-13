import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] num_list, int n) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : num_list) {
            numSet.add(num);
        }
        return numSet.contains(n) ? 1 : 0;
    }
}