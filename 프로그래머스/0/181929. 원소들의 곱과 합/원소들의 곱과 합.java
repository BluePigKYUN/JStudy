class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total = 0, xThing = 1;
        
        for(int i = 0 ; i < num_list.length ; i++){
            total += num_list[i];
            xThing *= num_list[i]; 
        }
        
        answer = xThing > Math.pow(total, 2) ? 0 : 1;
        
        return answer;
    }
}