package programmers.lv2.lessons12909;

public class Solution2 {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        if (count == 0) {
            return true;
        }
        return answer;
    }
}