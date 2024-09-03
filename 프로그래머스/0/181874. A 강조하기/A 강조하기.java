class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char ch : myString.toCharArray()){
            if(ch == 'a' || ch == 'A'){
                ch = 'A';
            } else if(ch >= 65 && ch <= 92){
                ch += 32;
            }
            answer += ch;
        }
        
        return answer;
    }
}