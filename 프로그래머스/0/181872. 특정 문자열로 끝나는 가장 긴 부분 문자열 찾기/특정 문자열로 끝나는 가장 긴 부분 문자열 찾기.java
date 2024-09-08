class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        int idx = myString.lastIndexOf(pat);
        
        for(int i = 0; i < idx + pat.length() ; i++){
            sb.append(myString.charAt(i));
        }
        
        return sb.toString();
    }
}