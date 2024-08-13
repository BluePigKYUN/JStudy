import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] temp1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] temp2 = Arrays.copyOf(num_list, n);
        
        System.arraycopy(temp1, 0, answer, 0, temp1.length);
        System.arraycopy(temp2, 0, answer, temp1.length, temp2.length);
        
        return answer;
    }
}