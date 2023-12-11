package programmers.beginners.lessons120836;

public class Solution4 {
    public int solution(int n) {
        if (n < 2) {
            return n;
        }
        int answer = 2; // 1과 자기자신
        for (int i = 2; i < Math.sqrt(n + 1); i++) {
            if (n % i == 0) {
                // 6 * 6과 같이 약수가 서로 같은 경우 1개만 더한다.
                answer += (i == n / i ? 1 : 2);
            }
        }
        return answer;
    }
}
