package programmers.lv1.lessons12919;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        for (String s : seoul) {
            if (s.equals("Kim")) {
                answer = "김서방은 " + count + "에 있다";
                break;
            }
            count++;
        }
        return answer;
    }
}