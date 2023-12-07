package programmers.lv1.lessons12903;

public class Solution {
    /**
     * 길이가 짝수이면 n/2번째와 n/2-1번째 값을 가져온다. 길이가 홀수이면 n/2번째 값을 가져온다
     */
    public String solution(String s) {
        int len = s.length();
        String answer = "";
        if (len % 2 == 0) {
            answer = s.substring(len / 2 - 1, len / 2 + 1);
        } else {
            answer = s.substring(len / 2, len / 2 + 1);
        }
        return answer;
    }
}