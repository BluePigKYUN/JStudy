class Solution {
    public int solution(int a, int b) {
        int allOdd = (a*a) + (b*b);
        int oneOdd = 2 * (a+b);
        int notOdd = Math.abs(a-b);
        
        if(a % 2 != 0 && b % 2 != 0){
            return allOdd;
        } else if(a % 2 != 0 || b % 2 != 0){
            return oneOdd;
        }
        
        return notOdd;
    }
}