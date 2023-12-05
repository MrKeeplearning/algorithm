package programmers.beginners.lessons120830;

public class Solution {
    public int solution(int n, int k) {
        final int price = 12000 * n + 2000 * k;
        int answer = 0;
        if (n >= 10) {
            answer = price - 2000 * (n / 10);
        } else {
            answer = price;
        }
        return answer;
    }
}