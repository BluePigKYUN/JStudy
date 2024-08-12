import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(int[] numLog) {
        List<String> list = new ArrayList<>();
        
        for(int i = 1 ; i < numLog.length ; i++){
            switch(numLog[i] - numLog[i - 1]){
                case 1: list.add("w"); break;
                case -1: list.add("s"); break;
                case 10: list.add("d"); break;
                case -10: list.add("a"); break;
            }
        }
        
        return String.join("", list);
    }
}