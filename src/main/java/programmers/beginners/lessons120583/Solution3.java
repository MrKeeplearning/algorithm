package programmers.beginners.lessons120583;

public class Solution3 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }
        return answer;
    }
}