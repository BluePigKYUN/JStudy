import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        
        for(int i = 0 ; i < myString.length() ; i++){
            char idx = myString.charAt(i);
            
            if(idx == 'x'){
                answer.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}