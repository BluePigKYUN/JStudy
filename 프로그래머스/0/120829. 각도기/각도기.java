class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if(angle <= 90) {
            return answer = angle == 90 ? 2 : 1;
        } else if (angle <= 180){
            return answer = angle == 180 ? 4 : 3;
        }
        
        return answer;
    }
}