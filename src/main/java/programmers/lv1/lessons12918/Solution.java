package programmers.lv1.lessons12918;

import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        int stringLength = s.length();
        boolean answer = false;
        if (stringLength == 4 || stringLength == 6) {
            answer = Pattern.matches("[0-9]+", s);
        }
        return answer;
    }

    public boolean solution2(String s) {
        int strLength = s.length();
        if (strLength == 4 || strLength == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}