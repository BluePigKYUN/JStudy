class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int height = box[0] / n;
        int length = box[1] / n;
        int width = box[2] / n;
        
        return answer = height * width * length;
    }
}