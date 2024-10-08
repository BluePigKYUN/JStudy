import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length){
            return answer = arr1.length > arr2.length ? 1 : -1;
        } else if(arr1.length == arr2.length) {
            if(Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()){
                return answer = 0;
            } else {
                return answer = Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1;
            }
        }
        
        return answer;
    }
}