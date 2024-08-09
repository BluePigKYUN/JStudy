class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String first = my_string.substring(0, s);
        
        if(my_string.length() > (first + overwrite_string).length()){
            String last = my_string.substring(overwrite_string.length() + s);
            answer = first + overwrite_string + last;
        } else {
            answer = first + overwrite_string;    
        }
        
        return answer;
    }
}