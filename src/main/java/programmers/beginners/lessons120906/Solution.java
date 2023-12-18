package programmers.beginners.lessons120906;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String stringNumber = String.valueOf(n);
        for (int i = 0; i < stringNumber.length(); i++) {
            answer += Character.getNumericValue(stringNumber.charAt(i));
        }
        return answer;
    }
}