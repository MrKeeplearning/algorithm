package programmers.beginners.lessons120840;

class Solution5 {
    public static void main(String[] args) {
        long factorial = factorial(10);
        System.out.println(factorial);
    }

    public int solution(int balls, int share) {
        long denominator = 1L;
        for (int i = share + 1; i <= balls; i++) {
            denominator *= i;
        }
        long answer = denominator / factorial(balls - share);
        return (int)answer;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}