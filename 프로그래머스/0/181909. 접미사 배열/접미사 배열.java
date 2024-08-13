import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        int size = my_string.length();
        List<String> lastList = new ArrayList<>();
        
        for(int i = 0 ; i < size ; i++){
            lastList.add(my_string.substring(i));
        }
        Collections.sort(lastList);
        
        return lastList.toArray(new String[0]);
    }
}