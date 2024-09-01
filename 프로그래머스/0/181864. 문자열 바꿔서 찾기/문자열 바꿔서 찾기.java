class Solution {
    public int solution(String myString, String pat) {
        StringBuilder temp = new StringBuilder();
        for(int i = 0 ; i < myString.length() ; i++){
            switch(myString.charAt(i)){
                case 'A': temp.append("B"); break;
                case 'B': temp.append("A"); break;
            }
        }
        
        String cs = temp.toString();
        return cs.indexOf(pat) >= 0 ? 1 : 0;
    }
}