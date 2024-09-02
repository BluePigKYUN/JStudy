class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char ch : myString.toCharArray()){
            if(ch < 108){
                answer += "l";
                continue;
            }
            answer += ch;
        }
        
        return answer;
    }
}