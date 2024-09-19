class Solution {
    public int solution(int hp) {
        int big = hp / 5;
        int mid = (hp % 5) / 3;
        int tiny = (hp % 5) % 3;
        
        return big + mid + tiny;
    }
}