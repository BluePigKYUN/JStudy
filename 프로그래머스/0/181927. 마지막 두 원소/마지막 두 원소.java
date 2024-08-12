import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int diff = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        int multi = num_list[num_list.length - 1] * 2;
        
        answer[num_list.length] = 
            num_list[num_list.length - 1] > num_list[num_list.length - 2] ?
                diff : multi;
        
        return answer;
    }
}