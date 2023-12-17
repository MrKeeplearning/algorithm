package programmers.beginners.lessons120854;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int count = 0;
        for (String string : strlist) {
            answer[count++] = string.length();
        }
        return answer;
    }
}
