import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < my_string.length() ; i++){
            if(idx < indices.length && i == indices[idx]){
                idx++;
            } else{
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}