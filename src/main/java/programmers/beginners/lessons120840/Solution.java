package programmers.beginners.lessons120840;

public class Solution {
    static final int MAX = 31;
    static int[] fac = new int[MAX];

    static {
        fac[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fac[i] = fac[i - 1] * i;    // i의 팩토리얼은 (i - 1)의 팩토리얼에 1을 곱한 값
        }
    }

    public int solution(int balls, int share) {
        return fac[balls] / (fac[share] * fac[balls - share]);
    }
}