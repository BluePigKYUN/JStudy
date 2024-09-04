class Solution {
    public int solution(String binomial) {
        String[] temp = binomial.split(" ");
        int answer = 0;        
        
        int first = Integer.parseInt(temp[0]);
        int second = Integer.parseInt(temp[2]);
        String operation = temp[1];
        
        switch(operation){
            case "+": answer = first + second; break;
            case "-": answer = first - second; break;
            case "*": answer = first * second; break;
            case "/": answer = first / second; break;
        }
        
        return answer;
    }
}