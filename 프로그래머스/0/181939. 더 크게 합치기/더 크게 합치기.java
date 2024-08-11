class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1, str2;
        str1 = "" + a + b;
        str2 = "" + b + a;
        if(Integer.parseInt(str1) > Integer.parseInt(str2)){
            answer = Integer.parseInt(str1);
        } else if(Integer.parseInt(str2) > Integer.parseInt(str1)){
            answer = Integer.parseInt(str2);
        } else {
            answer = Integer.parseInt(str1);
        }
        
        return answer;
    }
}