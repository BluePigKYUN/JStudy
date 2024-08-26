import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i] ; j++){
                list.add(arr[i]);
            }
        }
        
        Integer[] tempArray = list.toArray(new Integer[0]);
        
        int[] answer = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            answer[i] = tempArray[i];
        }
        
        //int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}