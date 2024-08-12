class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String flat = "";
        String odd = "";
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] % 2 == 0) {
                flat += num_list[i];
            } else{
                odd += num_list[i];
            }
        }
        answer = Integer.parseInt(flat) + Integer.parseInt(odd);
        return answer;
    }
}