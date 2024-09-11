class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int flat = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length ; i++){
            if(num_list[i] % 2 == 0){
                flat += 1;
            } else {
                odd += 1;
            }
        }
        
        answer[0] = flat;
        answer[1] = odd;
        
        return answer;
    }
}