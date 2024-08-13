import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if (strArr[i].indexOf("ad") == -1) {
                list.add(strArr[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
}