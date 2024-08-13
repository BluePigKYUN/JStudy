class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0 ; i < my_strings.length ; i++){
            int idx1 = parts[i][0];
            int idx2 = parts[i][1];
            String temp = my_strings[i].substring(idx1, idx2 + 1);
            answer.append(temp);
        }
        
        return answer.toString();
    }
}