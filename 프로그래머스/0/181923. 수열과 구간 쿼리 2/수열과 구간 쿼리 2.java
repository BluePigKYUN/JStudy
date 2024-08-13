class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0 ; i < queries.length ; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minVal = Integer.MAX_VALUE;
            boolean found = false;
            
            for(int j = s ; j <= e ; j++){
                if(arr[j] > k && arr[j] < minVal){
                    minVal = arr[j];
                    found = true;
                }
            }
            answer[i] = found ? minVal : -1;
        }
        
        return answer;
    }
}