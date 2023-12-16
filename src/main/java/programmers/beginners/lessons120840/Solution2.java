package programmers.beginners.lessons120840;

public class Solution2 {
    public int solution(int balls, int share) {
        int numerator = 1;
        for (int i = share + 1; i <= balls; i++) {
            numerator *= i;
        }
        return numerator / factorial(balls - share);
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}