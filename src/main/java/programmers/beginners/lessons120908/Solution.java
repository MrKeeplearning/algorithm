package programmers.beginners.lessons120908;

public class Solution {

    public int solution(String str1, String str2) {
        int answer = 1;
        boolean isContain = str1.contains(str2);
        if (isContain) {
            return answer;
        } else {
            answer++;
            return answer;
        }
    }

    public int solution2(String str1, String str2) {
        return (str1.contains(str2) ? 1 : 2);
    }

}
