import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        //String[] answer = my_string.split(" ");
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            char ch = my_string.charAt(i);
            
            if(ch == ' '){
                if(sb.length() > 0){
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
            } else{
                sb.append(ch);
            }
        }
        
        if(sb.length() > 0){
            answer.add(sb.toString());
        }

        
        return answer.toArray(new String[0]);
    }
}