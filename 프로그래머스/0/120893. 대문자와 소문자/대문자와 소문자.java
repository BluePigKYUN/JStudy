class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            char ch = my_string.charAt(i);
            if(ch >= 65 && ch <= 92){
                answer.append((char)(ch + 32));
            } else {
                answer.append((char)(ch - 32));
            }
        }
        
        return answer.toString();
    }
}