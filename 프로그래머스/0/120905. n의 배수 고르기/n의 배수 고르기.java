import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        
        for(int val : numlist){
            if(val % n == 0){
                answer.add(val);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}