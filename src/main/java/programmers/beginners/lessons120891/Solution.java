package programmers.beginners.lessons120891;

public class Solution {
    public int solution(int order) {
        int count = 0;
        for (char number : String.valueOf(order).toCharArray()) {
            if (number == '0') {
                continue;
            } else if ((int) number % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}