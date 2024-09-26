import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int pow = 1;
        while(pow < length) {
            pow *= 2;
        }
        
        if(pow== length){
            return arr;
        }
        
        int[] answer = Arrays.copyOf(arr, pow);
        return answer;
    }
}