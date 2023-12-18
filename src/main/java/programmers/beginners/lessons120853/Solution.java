package programmers.beginners.lessons120853;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] splitString = s.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].equals("Z")) {
                answer -= Integer.parseInt(splitString[i - 1]);
            } else {
                answer += Integer.parseInt(splitString[i]);
            }
        }
        return answer;
    }
}