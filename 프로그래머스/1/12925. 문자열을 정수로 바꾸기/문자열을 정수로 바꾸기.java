class Solution {
    public int solution(String s) {
        int result = 0;
        int sign = 1;
        int startIndex = 0;
        
        if (s.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
        } else if (s.charAt(0) == '+') {
            startIndex = 1;
        }

        for (int i = startIndex; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result * sign;
    }
}