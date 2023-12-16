package programmers.beginners.lessons120840;

public class Solution4 {
    /**
     * long 타입으로 변경했음에도 실패한다.
     */
    static final int MAX = 31;
    static long[] fac = new long[MAX];

    static {
        fac[0] = 1L;
        for (int i = 1; i < MAX; i++) {
            fac[i] = fac[i - 1] * i;    // i의 팩토리얼은 (i - 1)의 팩토리얼에 1을 곱한 값
        }
    }

    public int solution(int balls, int share) {
        long answer = fac[balls] / (fac[share] * fac[balls - share]);
        return (int)answer;
    }
}