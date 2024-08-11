class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        answer = myString.indexOf(pat) > -1 ? 1 : 0;
            
        return answer;
    }
}