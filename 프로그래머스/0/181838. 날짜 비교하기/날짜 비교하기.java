class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int compare1 = 0;
        int compare2 = 0;
        
        for(int i = 0 ; i < date1.length ; i++){
            compare1 = date1[i];
            compare2 = date2[i];
            if(compare1 != compare2){
                return answer = compare1 < compare2 ? 1 : 0;
            }
        }
        
        return answer;
    }
}